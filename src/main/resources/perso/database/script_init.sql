


CREATE TABLE tb_type_produit (
	type_produit_id				SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id			NUMERIC(15,0),
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id) REFERENCES tb_filtre_maison (filtre_maison_id)
)
CREATE TABLE tb_produit (
	produit_id					SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id			NUMERIC(15,0),
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id) REFERENCES tb_filtre_maison (filtre_maison_id)
)
CREATE TABLE tb_matiere (
	matiere_id					SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id			NUMERIC(15,0),
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id) REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_colori (
	colori_id					SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	filtre_maison_id			NUMERIC(15,0),
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL, 
	FOREIGN KEY (filtre_maison_id) REFERENCES tb_filtre_maison (filtre_maison_id)
)

CREATE TABLE tb_type_bien_immobilier (
	type_bien_immobilier_id		SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL
)

CREATE TABLE tb_type_vente_immobiliere (
	type_vente_immobiliere_id	SERIAL PRIMARY KEY,
	libelle						VARCHAR(50) UNIQUE NOT NULL,
	creation					TIMESTAMP NOT NULL,
	modification				TIMESTAMP NOT NULL,
	suppression					TIMESTAMP NOT NULL
)