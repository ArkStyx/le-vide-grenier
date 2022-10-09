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
	private boolean siAnnonceDisponible;	// FIXME CA SERT A QUOI CONCRETEMENT ?????
	private boolean siDonUniquement;
	
	
	/*
	FIXME CLASSE A MODIFIER
	
	FIXME POURQUOI NE PAS METTRE UN TYPE GLOBAL A TOUTES LES CATEGORIES ? TROUVER LES NOMS DE CATEGORIES
	-	Meuble de : Cuisine, Salle de Bain, ...
	-	Electromenager de : Cuisine, Salle de Bain, ...
	-	Arts De La Table de : Assiette, Rangements, Outils De Cuisine ...
	
	
	TODO A CREER - Sous-Filtre Maison.Ameublement :
		-	Produit (Accessoire, Armoire, Bar, Bain & baignoire, …)
		-	Matière (Acier, Bois, Bois massif, Bronze, …)
		-	Couleur (Argenté, Beige, Blanc, Bleu, …)
		-	TODO - A INTEGRER : Dons uniquement

	TODO A CREER - Sous-Filtre	Maison.Electromenager :
		-	Type (Cuisine, Maison et entretien, Beauté / Soin de la personne)
		-	Produit (Appareil de massage, Brosse à dent électrique, Brosse coiffante, Epilateur, …)
	
	TODO A CREER - Sous-Filtre	Maison.Arts De La Table :
		-	Produit (Assiette, Beurrier, Bocaux et pots, Boite de conservation et boite en métal, …)
		-	Matière (Acrylique, Alu, Argenterie, Bambou, …)
		-	Couleur (Argenté, Beige, Blanc, Bleu, …)
	*/
}
