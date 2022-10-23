package com.site.levidegrenier.dto.annonce;

import java.util.LinkedHashMap;

import org.springframework.web.multipart.MultipartFile;

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
	private String filtre;									// TODO FILTRE	====> LIER AVEC CATEGORIE ET SOUS-CATEGORIE
	private LinkedHashMap<String, MultipartFile> photos;
	private LocalisationGps localisationGps;
	private Utilisateur utilisateur;
}
