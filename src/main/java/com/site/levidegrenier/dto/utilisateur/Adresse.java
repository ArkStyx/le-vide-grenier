package com.site.levidegrenier.dto.utilisateur;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Adresse {

	private String adresse;
	private String complementAdresse;
	private Ville ville;
}
