package com.site.levidegrenier.dto.utilisateur;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {

	private String nom;
	private String prenom;
	private String numeroTelephone;
	private String numeroTelephonePortable;
	private String email;
	private Adresse adresse;
	private String annonce;						// TODO		=====>		List<Annonce>
	private String dateInscription;
	private String delaiReponse;
}
