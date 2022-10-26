package com.site.levidegrenier.dto.utilisateur;

import java.util.List;

import com.site.levidegrenier.dto.annonce.Annonce;
import com.site.levidegrenier.dto.recherche.Recherche;

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
	private String adresse;
	private String complementAdresse;
	private String ville;
	private String codePostal;
	private String dateInscription;
	private int delaiReponseEnMinutes;
	private boolean siProfessionnel;
	
	
	// TODO COMPARER FILTRE ET SOUS-RECHERCHE EN BDD
	// TODO FUSIONNER LES TABLES SI BESOIN
	
	private List<Annonce> listeAnnonces;
	private List<Annonce> listeAnnoncesFavorites;
	private List<Recherche> listeRecherchesFavorites;
}
