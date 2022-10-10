package com.site.levidegrenier.dto.annonce;

import java.util.List;

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
	private String sousCategorie;
	private String filtre;						// TODO FILTRE	====> LIE AVEC CATEGORIE ET SOUS-CATEGORIE
	private List<String> photos;				// TODO LIST<PHOTOS>
	private String localisation;
	private LocalisationGps localisationGps;
	private Utilisateur utilisateur;
}
