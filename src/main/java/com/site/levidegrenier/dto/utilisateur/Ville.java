package com.site.levidegrenier.dto.utilisateur;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ville {

	private String libelle;
	private String codePostal;
	private String libelleDepartement;
	private String codeDepartement;
}
