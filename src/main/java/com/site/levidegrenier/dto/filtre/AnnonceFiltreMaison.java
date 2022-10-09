package com.site.levidegrenier.dto.filtre;

import java.util.Set;

import com.site.levidegrenier.dto.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreMaison extends AnnonceFiltreCommun {

	private boolean siAfficherAnnonceAvecLivraison;
	private Set<String> listeTypeProduit;
	private Set<String> listeTypeMatiere;
	private Set<String> listeColoris;
	private Set<String> listeEtat;
	private boolean siAnnonceDisponible;
	
	
	/*
	FIXME CLASSE A MODIFIER
	
	TODO A CREER - Sous-Filtre Maison.Ameublement :
		-	Voir les annonces avec livraison également
		-	Produit (Accessoire, Armoire, Bar, Bain & baignoire, …)
		-	Matière (Acier, Bois, Bois massif, Bronze, …)
		-	Couleur (Argenté, Beige, Blanc, Bleu, …)
		-	État
		-	TODO - A INTEGRER : Dons uniquement

	TODO A CREER - Sous-Filtre	Maison.Electromenager :
			-	TODO - A INTEGRER : Type (Cuisine, Maison et entretien, Beauté / Soin de la personne)
			-	TODO - A INTEGRER : Produit (Appareil de massage, Brosse à dent électrique, Brosse coiffante, Epilateur, …)
			-	État
	
	TODO A CREER - Sous-Filtre	Maison.Arts De La Table :
			-	Produit (Assiette, Beurrier, Bocaux et pots, Boite de conservation et boite en métal, …)
			-	Matière (Acrylique, Alu, Argenterie, Bambou, …)
			-	Couleur (Argenté, Beige, Blanc, Bleu, …)
			-	État
	*/
}
