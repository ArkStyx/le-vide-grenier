package com.site.levidegrenier.dto.utilisateur;

import java.util.List;

import com.site.levidegrenier.dto.annonce.Annonce;

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
	private String dateInscription;
	private String delaiReponse;
	private boolean siParticulier;
	private List<Annonce> listeAnnonces;
	private List<Annonce> listeAnnoncesFavorites;
}
