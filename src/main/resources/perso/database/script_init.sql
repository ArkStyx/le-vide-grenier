


CREATE TABLE tb_utilisateur (
	utilisateur_id							SERIAL PRIMARY KEY,
	nom										VARCHAR(50) NOT NULL,
	prenom									VARCHAR(50) NOT NULL,
	numero telephone						VARCHAR(15),
	numero telephone portable				VARCHAR(15),
	email									VARCHAR(250) NOT NULL
	adresse_id								NUMERIC(15,0),
	FOREIGN KEY (adresse_id)				REFERENCE tb_adresse (adresse_id)
)

CREATE TABLE tb_utilisateur_historique (
	utilisateur_historique_id				SERIAL PRIMARY KEY,
	nom										VARCHAR(50) NOT NULL,
	prenom									VARCHAR(50) NOT NULL,
	numero telephone						VARCHAR(15),
	numero telephone portable				VARCHAR(15),
	email									VARCHAR(250) NOT NULL
	adresse_id								NUMERIC(15,0),
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (adresse_id)				REFERENCE tb_adresse (adresse_id)
)

CREATE TABLE tb_adresse (
	adresse_id								SERIAL PRIMARY KEY,
	adresse									VARCHAR(250) NOT NULL,
	complement_adresse						VARCHAR(250) NOT NULL,
	ville_id								NUMERIC(15,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (ville_id)					REFERENCE tb_ville (ville_id)
)

CREATE TABLE tb_ville (
	ville_id								SERIAL PRIMARY KEY,
	libelle									VARCHAR(250) NOT NULL,
	code_postal								VARCHAR(5) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL
)

CREATE TABLE tb_departement (
	departement_id							SERIAL PRIMARY KEY,
	libelle									VARCHAR(250) NOT NULL,
	code									VARCHAR(2) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL
)

CREATE TABLE tb_annonce (
	annonce_id								SERIAL PRIMARY KEY,
	categorie								VARCHAR(250) NOT NULL,
	sous_categorie							VARCHAR(250),
	localisation_id							NUMERIC(15,0) NOT NULL,
	utilisateur_id							NUMERIC(15,0) NOT NULL,
	prix									NUMERIC(15,0) NOT NULL,
	si_offre								BOOLEAN	NOT NULL,
	si_annonce_urgente						BOOLEAN NOT NULL,
	si_vendeur_particulier					BOOLEAN NOT NULL,
	FOREIGN KEY (localisation_id)			REFERENCES tb_localisation (localisation_id),
	FOREIGN KEY (utilisateur_id)			REFERENCES tb_utilisateur (utilisateur_id)
)

CREATE TABLE tb_annonce_historique (
	annonce_historique_id					SERIAL PRIMARY KEY,
	categorie								VARCHAR(250) NOT NULL,
	sous_categorie							VARCHAR(250),
	localisation_id							NUMERIC(15,0) NOT NULL,
	utilisateur_id							NUMERIC(15,0) NOT NULL,
	annonce_id								NUMERIC(15,0) NOT NULL,
	prix									NUMERIC(15,0) NOT NULL,
	si_offre								BOOLEAN	NOT NULL,
	si_annonce_urgente						BOOLEAN NOT NULL,
	si_vendeur_particulier					BOOLEAN NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (localisation_id)			REFERENCES tb_localisation (localisation_id),
	FOREIGN KEY (utilisateur_id)			REFERENCES tb_utilisateur (utilisateur_id),
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
)

CREATE TABLE tb_photo (
	photo_id								SERIAL PRIMARY KEY,
	annonce_id								NUMERIC(15,0) NOT NULL,
	photo									BYTEA NOT NULL,
	ordre_affichage							NUMERIC(3,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
)

CREATE TABLE tb_localisation (
	localisation_id							SERIAL PRIMARY KEY,
	ville_id								NUMERIC(15,0) NOT NULL,
	code_postal_id							NUMERIC(15,0) NOT NULL,
	adresse_precise							VARCHAR(750) NOT NULL,
	latitude_degres_decimaux				NUMERIC(8,6),
	longitude_degres_decimaux				NUMERIC(9,6),
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (ville_id)					REFERENCES tb_ville (ville_id),
	FOREIGN KEY (code_postal_id)			REFERENCES tb_code_postal (code_postal_id)
)

CREATE TABLE tb_filtre_maison (
	filtre_maison_id						SERIAL PRIMARY KEY,
	si_annonce_avec_livraison				BOOLEAN NOT NULL,
	si_disponible							BOOLEAN NOT NULL,
	si_don									BOOLEAN NOT NULL,
	annonce_id								NUMERIC(15,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
)

CREATE TABLE tb_filtre_animal (
	filtre_animal_id						SERIAL PRIMARY KEY,
	type_animal								VARCHAR(50) NOT NULL,
	annonce_id								NUMERIC(15,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (annonce_id)				REFERENCES tb_annonce (annonce_id)
)

CREATE TABLE tb_filtre_immobilier (
	filtre_immobilier_id					SERIAL PRIMARY KEY,
	type_bien_immobilier_id					NUMERIC(15,0) NOT NULL,
	type_vente_immobiliere_id				NUMERIC(15,0) NOT NULL,
	surface_habitable						NUMERIC(15,0),
	surface_rerrain							NUMERIC(15,0),
	nombre_de_pieces						NUMERIC(15,0),
	classe_energie							VARCHAR(50),
	gaz_effet_serre							VARCHAR(50),
	annonce_id								NUMERIC(15,0),
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (type_bien_immobilier_id)	REFERENCE tb_type_bien_immobilier (type_bien_immobilier_id),
	FOREIGN KEY (type_vente_immobiliere_id)	REFERENCE tb_type_vente_immobiliere (type_vente_immobiliere_id),
	FOREIGN KEY (annonce_id)				REFERENCE tb_annonce (annonce_id)
)

CREATE TABLE tb_filtre_location (
	filtre_location_id						SERIAL PRIMARY KEY,
	si_meublee								BOOLEAN NOT NULL,
	filtre_immobilier_id					NUMERIC(15,0) NOT NULL,
	creation								TIMESTAMP NOT NULL,
	modification							TIMESTAMP NOT NULL,
	suppression								TIMESTAMP NOT NULL,
	FOREIGN KEY (filtre_immobilier_id)		REFERENCE tb_filtre_immobilier (filtre_immobilier_id)
)



CREATE TABLE tb_type_produit (
	type_produit_id					SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id				NUMERIC(15,0),
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_produit (
	produit_id						SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id				NUMERIC(15,0),
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_matiere (
	matiere_id						SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id				NUMERIC(15,0),
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_colori (
	colori_id						SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id				NUMERIC(15,0),
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id)	REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_type_bien_immobilier (
	type_bien_immobilier_id			SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL
)

CREATE TABLE tb_type_vente_immobiliere (
	type_vente_immobiliere_id		SERIAL PRIMARY KEY,
	libelle							VARCHAR(50) UNIQUE NOT NULL,
	creation						TIMESTAMP NOT NULL,
	modification					TIMESTAMP NOT NULL,
	suppression						TIMESTAMP NOT NULL
)