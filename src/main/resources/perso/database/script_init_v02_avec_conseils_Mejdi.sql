
CREATE TABLE tb_utilisateur (
	nom										VARCHAR(50) NOT NULL,
	prenom									VARCHAR(50) NOT NULL,
	numero_telephone						VARCHAR(15),
	numero_telephone_portable				VARCHAR(15),
	email									VARCHAR(250) NOT NULL,
	adresse									VARCHAR(250) NOT NULL,
	complement_adresse						VARCHAR(250) NOT NULL,
	libelle_ville							VARCHAR(250) NOT NULL,
	code_postal								VARCHAR(5) NOT NULL,
	UNIQUE(numero_telephone),
	UNIQUE(numero_telephone_portable),
	UNIQUE(email)
);

CREATE TABLE tb_utilisateur_historique (
	nom										VARCHAR(50) NOT NULL,
	prenom									VARCHAR(50) NOT NULL,
	numero_telephone						VARCHAR(15),
	numero_telephone_portable				VARCHAR(15),
	email									VARCHAR(250) NOT NULL,
	adresse									VARCHAR(250) NOT NULL,
	complement_adresse						VARCHAR(250) NOT NULL,
	libelle_ville							VARCHAR(250) NOT NULL,
	code_postal								VARCHAR(5) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	UNIQUE(numero_telephone),
	UNIQUE(numero_telephone_portable),
	UNIQUE(email)
);

CREATE TABLE tb_categorie (
	categorie_id							SERIAL PRIMARY KEY,
	dependance_categorie					VARCHAR(100),
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL
);





-- TODO ERREUR:  la relation « tb_ville » n'existe pas




CREATE TABLE tb_localisation (
	localisation_id							SERIAL PRIMARY KEY,
	ville_id								INTEGER NOT NULL,
	code_postal_id							INTEGER NOT NULL,
	adresse_precise							VARCHAR(750) NOT NULL,
	latitude_degres_decimaux				NUMERIC(8,6),
	longitude_degres_decimaux				NUMERIC(9,6),
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (ville_id)					REFERENCES tb_ville (ville_id),
	FOREIGN KEY (code_postal_id)			REFERENCES tb_code_postal (code_postal_id)
);

CREATE TABLE tb_annonce (
	annonce_id								SERIAL PRIMARY KEY,
	categorie_id							INTEGER NOT NULL,
	sous_categorie							VARCHAR(250),
	localisation_id							INTEGER NOT NULL,
	utilisateur_id							INTEGER NOT NULL,
	prix									INTEGER NOT NULL,
	si_offre								BOOLEAN	NOT NULL,
	si_annonce_urgente						BOOLEAN NOT NULL,
	si_vendeur_particulier					BOOLEAN NOT NULL,
	FOREIGN KEY (categorie_id)				REFERENCES tb_categorie (categorie_id),
	FOREIGN KEY (localisation_id)			REFERENCES tb_localisation (localisation_id),
	FOREIGN KEY (utilisateur_id)			REFERENCES tb_utilisateur (utilisateur_id)
);

CREATE TABLE tb_annonce_historique (
	annonce_historique_id					SERIAL PRIMARY KEY,
	categorie_id							INTEGER NOT NULL,
	sous_categorie							VARCHAR(250),
	localisation_id							INTEGER NOT NULL,
	utilisateur_id							INTEGER NOT NULL,
	annonce_id								INTEGER NOT NULL,
	prix									INTEGER NOT NULL,
	si_offre								BOOLEAN	NOT NULL,
	si_annonce_urgente						BOOLEAN NOT NULL,
	si_vendeur_particulier					BOOLEAN NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (categorie_id)				REFERENCES tb_categorie (categorie_id),
	FOREIGN KEY (localisation_id)			REFERENCES tb_localisation (localisation_id),
	FOREIGN KEY (utilisateur_id)			REFERENCES tb_utilisateur (utilisateur_id),
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
);

CREATE TABLE tb_photo (
	photo_id								SERIAL PRIMARY KEY,
	annonce_id								INTEGER NOT NULL,
	photo									BYTEA NOT NULL,
	ordre_affichage							NUMERIC(3,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
);

CREATE TABLE tb_filtre_maison (
	filtre_maison_id						SERIAL PRIMARY KEY,
	si_annonce_avec_livraison				BOOLEAN NOT NULL,
	si_disponible							BOOLEAN NOT NULL,
	si_don									BOOLEAN NOT NULL,
	annonce_id								INTEGER NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
);

CREATE TABLE tb_filtre_animal (
	filtre_animal_id						SERIAL PRIMARY KEY,
	type_animal								VARCHAR(50) NOT NULL,
	annonce_id								INTEGER NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
);

CREATE TABLE tb_filtre_immobilier (
	filtre_immobilier_id					SERIAL PRIMARY KEY,
	type_bien_immobilier_id					INTEGER NOT NULL,
	type_vente_immobiliere_id				INTEGER NOT NULL,
	surface_habitable						INTEGER,
	surface_rerrain							INTEGER,
	nombre_de_pieces						INTEGER,
	classe_energie							VARCHAR(50),
	gaz_effet_serre							VARCHAR(50),
	annonce_id								INTEGER,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (type_bien_immobilier_id)	REFERENCES tb_type_bien_immobilier (type_bien_immobilier_id),
	FOREIGN KEY (type_vente_immobiliere_id)	REFERENCES tb_type_vente_immobiliere (type_vente_immobiliere_id),
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
);

CREATE TABLE tb_filtre_location (
	filtre_location_id						SERIAL PRIMARY KEY,
	si_meublee								BOOLEAN NOT NULL,
	filtre_immobilier_id					INTEGER NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (filtre_immobilier_id)		REFERENCES tb_filtre_immobilier (filtre_immobilier_id)
);




-- TODO CORRIGER tb_type_produit	/	FOREIGN KEY (filtre_maison_id)	====>	TROP DE CREATION DE LIGNES
-- TODO CORRIGER tb_produit			/	FOREIGN KEY (filtre_maison_id)	====>	TROP DE CREATION DE LIGNES
-- TODO CORRIGER tb_matiere			/	FOREIGN KEY (filtre_maison_id)	====>	TROP DE CREATION DE LIGNES
-- TODO CORRIGER tb_colori			/	FOREIGN KEY (filtre_maison_id)	====>	TROP DE CREATION DE LIGNES

CREATE TABLE tb_type_produit (
	libelle_type_produit			VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id				INTEGER,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_type_produit)
);

CREATE TABLE tb_produit (
	libelle_produit					VARCHAR(50) NOT NULL,
	filtre_maison_id				INTEGER,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_produit)
);

CREATE TABLE tb_matiere (
	libelle_matiere					VARCHAR(50) NOT NULL,
	filtre_maison_id				INTEGER,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_matiere)
);

CREATE TABLE tb_colori (
	libelle_couleur					VARCHAR(50) NOT NULL,
	filtre_maison_id				INTEGER,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id),
	UNIQUE(libelle_couleur)
);

CREATE TABLE tb_type_bien_immobilier (
	libelle_type_bien_immobilier	VARCHAR(50) NOT NULL,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL,
	UNIQUE(libelle_type_bien_immobilier)
);

CREATE TABLE tb_type_vente_immobiliere (
	libelle_type_vente_immobiliere	VARCHAR(50) NOT NULL,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL,
	UNIQUE(libelle_type_vente_immobiliere)
);