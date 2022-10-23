
CREATE TABLE lvg.tb_utilisateur (
	nom												VARCHAR(50) NOT NULL,
	prenom											VARCHAR(50) NOT NULL,
	numero_telephone								VARCHAR(15),
	numero_telephone_portable						VARCHAR(15),
	email											VARCHAR(250) NOT NULL,
	adresse											VARCHAR(250) NOT NULL,
	complement_adresse								VARCHAR(250) NOT NULL,
	ville											VARCHAR(250) NOT NULL,
	code_postal										VARCHAR(5) NOT NULL,
	si_professionnel								BOOLEAN NOT NULL DEFAULT FALSE,
	delai_reponse_en_heure_minutes					INTEGER,
	UNIQUE(numero_telephone),
	UNIQUE(numero_telephone_portable),
	UNIQUE(email)
);

CREATE TABLE lvg.tb_utilisateur_historique (
	nom												VARCHAR(50) NOT NULL,
	prenom											VARCHAR(50) NOT NULL,
	numero_telephone								VARCHAR(15),
	numero_telephone_portable						VARCHAR(15),
	email											VARCHAR(250) NOT NULL,
	adresse											VARCHAR(250) NOT NULL,
	complement_adresse								VARCHAR(250) NOT NULL,
	ville											VARCHAR(250) NOT NULL,
	code_postal										VARCHAR(5) NOT NULL,
	si_professionnel								BOOLEAN NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	UNIQUE(numero_telephone),
	UNIQUE(numero_telephone_portable),
	UNIQUE(email)
);

CREATE TABLE lvg.tb_categorie (
	categorie_id									SERIAL PRIMARY KEY,
	dependance_categorie							VARCHAR(100),
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL
);

CREATE TABLE lvg.tb_localisation_gps (
	localisation_gps_id								SERIAL PRIMARY KEY,
	adresse											VARCHAR(250) NOT NULL,
	complement_adresse								VARCHAR(250) NOT NULL,
	ville											VARCHAR(250) NOT NULL,
	code_postal										VARCHAR(5) NOT NULL,
	latitude_degres_decimaux						NUMERIC(8,6),
	longitude_degres_decimaux						NUMERIC(9,6),
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL
);


-- TODO FIXME - COMMENT GERER LES ANNONCES UTILISATEURS/ANNONCES PREFEREES ?



CREATE TABLE lvg.tb_annonce (
	annonce_id										SERIAL PRIMARY KEY,
	email											VARCHAR(250) NOT NULL,
	categorie_id									INTEGER NOT NULL,
	localisation_gps_id								INTEGER NOT NULL,
	prix											INTEGER NOT NULL,
	si_offre										BOOLEAN	NOT NULL,
	si_annonce_urgente								BOOLEAN NOT NULL,
	FOREIGN KEY (email)								REFERENCES lvg.tb_utilisateur (email),
	FOREIGN KEY (categorie_id)						REFERENCES lvg.tb_categorie (categorie_id),
	FOREIGN KEY (localisation_gps_id)				REFERENCES lvg.tb_localisation_gps (localisation_gps_id)
);

CREATE TABLE lvg.tb_annonce_historique (
	annonce_historique_id							SERIAL PRIMARY KEY,
	email											VARCHAR(250) NOT NULL,
	categorie_id									INTEGER NOT NULL,
	localisation_gps_id								INTEGER NOT NULL,
	annonce_id										INTEGER NOT NULL,
	prix											INTEGER NOT NULL,
	si_offre										BOOLEAN	NOT NULL,
	si_annonce_urgente								BOOLEAN NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (email)								REFERENCES lvg.tb_utilisateur (email),
	FOREIGN KEY (categorie_id)						REFERENCES lvg.tb_categorie (categorie_id),
	FOREIGN KEY (localisation_gps_id)				REFERENCES lvg.tb_localisation_gps (localisation_gps_id),
	FOREIGN KEY (annonce_id)						REFERENCES lvg.tb_annonce (annonce_id)
);

CREATE TABLE lvg.tb_photo (
	photo_id										SERIAL PRIMARY KEY,
	annonce_id										INTEGER NOT NULL,
	photo											BYTEA NOT NULL,
	ordre_affichage									NUMERIC(3,0) NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)						REFERENCES lvg.tb_annonce (annonce_id)
);

CREATE TABLE lvg.tb_filtre_maison (
	filtre_maison_id								SERIAL PRIMARY KEY,
	si_annonce_avec_livraison						BOOLEAN NOT NULL,
	si_disponible									BOOLEAN NOT NULL,
	si_don											BOOLEAN NOT NULL,
	annonce_id										INTEGER NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)						REFERENCES lvg.tb_annonce (annonce_id)
);

CREATE TABLE lvg.tb_filtre_animal (
	filtre_animal_id								SERIAL PRIMARY KEY,
	type_animal										VARCHAR(50) NOT NULL,
	annonce_id										INTEGER NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)						REFERENCES lvg.tb_annonce (annonce_id)
);

CREATE TABLE lvg.tb_type_bien_immobilier (
	libelle_type_bien_immobilier					VARCHAR(100) NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	UNIQUE(libelle_type_bien_immobilier)
);

CREATE TABLE lvg.tb_type_vente_immobiliere (
	libelle_type_vente_immobiliere					VARCHAR(100) NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	UNIQUE(libelle_type_vente_immobiliere)
);

CREATE TABLE lvg.tb_filtre_immobilier (
	filtre_immobilier_id							SERIAL PRIMARY KEY,
	libelle_type_bien_immobilier					VARCHAR(100) NOT NULL,
	libelle_type_vente_immobiliere					VARCHAR(100) NOT NULL,
	surface_habitable								INTEGER,
	surface_rerrain									INTEGER,
	nombre_de_pieces								INTEGER,
	classe_energie									VARCHAR(50),
	gaz_effet_serre									VARCHAR(50),
	annonce_id										INTEGER,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (libelle_type_bien_immobilier)		REFERENCES lvg.tb_type_bien_immobilier (libelle_type_bien_immobilier),
	FOREIGN KEY (libelle_type_vente_immobiliere)	REFERENCES lvg.tb_type_vente_immobiliere (libelle_type_vente_immobiliere),
	FOREIGN KEY (annonce_id)						REFERENCES lvg.tb_annonce (annonce_id)
);

CREATE TABLE lvg.tb_filtre_location (
	filtre_location_id								SERIAL PRIMARY KEY,
	si_meublee										BOOLEAN NOT NULL,
	filtre_immobilier_id							INTEGER NOT NULL,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL,
	FOREIGN KEY (filtre_immobilier_id)				REFERENCES lvg.tb_filtre_immobilier (filtre_immobilier_id)
);

CREATE TABLE lvg.tb_type_produit (
	libelle_type_produit							VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id								INTEGER,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)					REFERENCES lvg.tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_type_produit)
);

CREATE TABLE lvg.tb_produit (
	libelle_produit									VARCHAR(50) NOT NULL,
	filtre_maison_id								INTEGER,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)					REFERENCES lvg.tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_produit)
);

CREATE TABLE lvg.tb_matiere (
	libelle_matiere									VARCHAR(50) NOT NULL,
	filtre_maison_id								INTEGER,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)					REFERENCES lvg.tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_matiere)
);

CREATE TABLE lvg.tb_colori (
	libelle_couleur									VARCHAR(50) NOT NULL,
	filtre_maison_id								INTEGER,
	creation										TIMESTAMP NOT NULL,
	modification									TIMESTAMP NOT NULL,
	suppression										TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)					REFERENCES lvg.tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_couleur)
);
