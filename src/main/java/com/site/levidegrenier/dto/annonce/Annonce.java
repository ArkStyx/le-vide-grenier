package com.site.levidegrenier.dto.annonce;

import java.util.LinkedHashMap;

import org.springframework.web.multipart.MultipartFile;

import com.site.levidegrenier.dto.filtre.FiltreCommun;
import com.site.levidegrenier.dto.utilisateur.LocalisationGps;
import com.site.levidegrenier.dto.utilisateur.Utilisateur;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Annonce {

	private String categorie;
	private String sousCategorie;							// TODO Maison.Ameublement / Maison.Electromenager / Maison.Arts De La Table
	private FiltreCommun annonceFiltre;									// TODO FILTRE	====> LIER AVEC CATEGORIE ET SOUS-CATEGORIE
	private LinkedHashMap<String, MultipartFile> photos;
	private LocalisationGps localisationGps;
	private Utilisateur utilisateur;


	/*
	TODO A SUPPRIMER - POUR RAPPEL
	CREATE TABLE lvg.tb_annonce (
		email											TEXT NOT NULL,
		categorie_id									INTEGER NOT NULL,
		localisation_gps_id								INTEGER NOT NULL,
		prix											INTEGER NOT NULL,
		si_offre										BOOLEAN	NOT NULL,
		si_annonce_urgente								BOOLEAN NOT NULL,
	);
	
		CREATE TABLE lvg.tb_annonce_immobilier (
			libelle_type_bien_immobilier					VARCHAR(100) NOT NULL,
			libelle_type_vente_immobiliere					VARCHAR(100) NOT NULL,
			surface_habitable								INTEGER,
			surface_rerrain									INTEGER,
			nombre_de_pieces								INTEGER,
			classe_energie									VARCHAR(50),
			gaz_effet_serre									VARCHAR(50),
		);
			CREATE TABLE lvg.tb_annonce_location (
				si_meublee										BOOLEAN NOT NULL,
			);
	
		CREATE TABLE lvg.tb_annonce_maison (
			si_annonce_avec_livraison						BOOLEAN NOT NULL,
			si_disponible									BOOLEAN NOT NULL,
			si_don											BOOLEAN NOT NULL,
		);
	
		CREATE TABLE lvg.tb_annonce_animal (
			type_animal										VARCHAR(50) NOT NULL,
		);
	*/

}