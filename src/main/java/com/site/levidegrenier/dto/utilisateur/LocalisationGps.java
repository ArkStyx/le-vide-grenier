package com.site.levidegrenier.dto.utilisateur;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LocalisationGps {

	private String adresse;
	private String complementAdresse;
	private String ville;
	private String codePostal;
	private String latitudeDegresDecimaux;
	private String longitudeDegresDecimaux;
	
	
	/*
	TODO EXEMPLE
	
	9 Rue Jules Ferry
	35300 Fougères
	48.353019, -1.200560
	 */
}
