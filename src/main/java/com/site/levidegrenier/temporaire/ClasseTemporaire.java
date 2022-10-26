package com.site.levidegrenier.temporaire;

import java.util.LinkedHashSet;
import java.util.Set;

import com.site.levidegrenier.dto.filtre.animal.FiltreAnimaux;
import com.site.levidegrenier.dto.filtre.immobilier.FiltreImmobilier;
import com.site.levidegrenier.dto.filtre.maison.FiltreMaison;
import com.site.levidegrenier.dto.filtre.vehicule.FiltreVehicule;
import com.site.levidegrenier.utilities.UtilitaireFiltre;

public class ClasseTemporaire {

	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public void methodeDeTest_FiltreAnimaux() {
		
		FiltreAnimaux annonceFiltreAnimaux = new FiltreAnimaux();
		annonceFiltreAnimaux.setPrixMinimum(null);
		annonceFiltreAnimaux.setPrixMaximum(null);
		annonceFiltreAnimaux.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreAnimaux.setSiOffre(true);
		annonceFiltreAnimaux.setSiVendeurParticulier(true);
		
		annonceFiltreAnimaux.setTypeAnimal(UtilitaireFiltre.ANIMAUX_CHIEN);
	}

	// TODO A SUPPRIMER - METHODE DE TEST
	public void methodeDeTest_FiltreImmobilier() {
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_A ????
		Set<String> listeClasseEnergie = new LinkedHashSet<>();
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_A);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_B);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_C);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_D);
		
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_MAISON ????
		Set<String> listeTypeBienImmobilier = new LinkedHashSet<>();
		listeTypeBienImmobilier.add(UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_MAISON);
		listeTypeBienImmobilier.add(UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_TERRAIN);
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_ANCIEN ????
		Set<String> listeTypeVenteImmobiliere = new LinkedHashSet<>();
		listeTypeVenteImmobiliere.add(UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_ANCIEN);
		listeTypeVenteImmobiliere.add(UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_NEUF);

		FiltreImmobilier annonceFiltreImmobilier = new FiltreImmobilier();
		annonceFiltreImmobilier.setPrixMinimum(null);
		annonceFiltreImmobilier.setPrixMaximum(null);
		annonceFiltreImmobilier.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreImmobilier.setSiOffre(true);
		annonceFiltreImmobilier.setSiVendeurParticulier(true);
		
		annonceFiltreImmobilier.setListeClasseEnergie(listeClasseEnergie);
		annonceFiltreImmobilier.setNombreDePieces(null);
		annonceFiltreImmobilier.setSurfaceHabitableMinimum(100);
		annonceFiltreImmobilier.setSurfaceHabitableMaximum(null);
		annonceFiltreImmobilier.setSurfaceTerrainMinimum(4000);
		annonceFiltreImmobilier.setSurfaceTerrainMaximum(null);
		annonceFiltreImmobilier.setListeTypeBienImmobilier(listeTypeBienImmobilier);
		annonceFiltreImmobilier.setListeTypeVenteImmobiliere(listeTypeVenteImmobiliere);
	}
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public void methodeDeTest_FiltreVehicule() {
		
		FiltreVehicule annonceFiltreVehicule = new FiltreVehicule();
		annonceFiltreVehicule.setPrixMinimum(null);
		annonceFiltreVehicule.setPrixMaximum(null);
		annonceFiltreVehicule.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreVehicule.setSiOffre(true);
		annonceFiltreVehicule.setSiVendeurParticulier(true);
	}
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public void methodeDeTest_FiltreMaison() {
		
		FiltreMaison annonceFiltreMaison = new FiltreMaison();
		annonceFiltreMaison.setPrixMinimum(null);
		annonceFiltreMaison.setPrixMaximum(null);
		annonceFiltreMaison.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreMaison.setSiOffre(true);
		annonceFiltreMaison.setSiVendeurParticulier(true);
		

		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.MAISON_TYPE_PRODUIT_ARMOIRE ????
		Set<String> listeType = new LinkedHashSet<>();
		listeType.add(UtilitaireFiltre.MAISON_PRODUIT_ARMOIRE);
		listeType.add(UtilitaireFiltre.MAISON_PRODUIT_LIT);
		
		Set<String> listeProduit = new LinkedHashSet<>();
		listeProduit.add(UtilitaireFiltre.MAISON_PRODUIT_ARMOIRE);
		listeProduit.add(UtilitaireFiltre.MAISON_PRODUIT_LIT);
		
		Set<String> listeMatiere = new LinkedHashSet<>();
		listeMatiere.add(UtilitaireFiltre.MAISON_MATIERE_BOIS);
		listeMatiere.add(UtilitaireFiltre.MAISON_MATIERE_FER);
		
		Set<String> listeColoris = new LinkedHashSet<>();
		listeColoris.add(UtilitaireFiltre.MAISON_COULEUR_BLANC);
		listeColoris.add(UtilitaireFiltre.MAISON_COULEUR_BLEU);
		
		Set<String> listeEtat = new LinkedHashSet<>();
		listeEtat.add(UtilitaireFiltre.MAISON_ETAT_TRES_BON);
		listeEtat.add(UtilitaireFiltre.MAISON_ETAT_BON);
		
		annonceFiltreMaison.setSiAfficherAnnonceAvecLivraison(true);
		annonceFiltreMaison.setListeType(listeType);
		annonceFiltreMaison.setListeProduit(listeProduit);
		annonceFiltreMaison.setListeMatiere(listeMatiere);
		annonceFiltreMaison.setListeColoris(listeColoris);
		annonceFiltreMaison.setListeEtat(listeEtat);
		annonceFiltreMaison.setSiAnnonceDisponible(true);
	}
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	
	// TODO LES AUTRES CLASSES
	
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	
}
