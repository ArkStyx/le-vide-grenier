package com.site.levidegrenier.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.levidegrenier.dto.filtre.animaux.AnnonceFiltreAnimaux;
import com.site.levidegrenier.dto.filtre.immobilier.AnnonceFiltreImmobilier;
import com.site.levidegrenier.dto.filtre.maison.AnnonceFiltreMaison;
import com.site.levidegrenier.dto.filtre.vehicule.AnnonceFiltreVehicule;
import com.site.levidegrenier.utilities.UtilitaireFiltre;

@Controller
@RequestMapping("le-vide-grenier")
public class LeVideGrenierController {

	public ResponseEntity<String> coucou() {
		return ResponseEntity.ok("Coucou !");
	}
	
	
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public ResponseEntity<String> methodeDeTest_FiltreAnimaux() {
		
		AnnonceFiltreAnimaux annonceFiltreAnimaux = new AnnonceFiltreAnimaux();
		annonceFiltreAnimaux.setPrixMinimum(null);
		annonceFiltreAnimaux.setPrixMaximum(null);
		annonceFiltreAnimaux.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreAnimaux.setSiOffre(true);
		annonceFiltreAnimaux.setSiVendeurParticulier(true);
		
		annonceFiltreAnimaux.setTypeAnimal(UtilitaireFiltre.ANIMAUX_CHIEN);
		
		return ResponseEntity.ok("methodeDeTest_FiltreAnimaux");
	}

	// TODO A SUPPRIMER - METHODE DE TEST
	public ResponseEntity<String> methodeDeTest_FiltreImmobilier() {
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_A ????
		Set<String> listeClasseEnergie = new LinkedHashSet<>();
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_A);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_B);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_C);
		listeClasseEnergie.add(UtilitaireFiltre.IMMOBILIER_CLASSE_ENERGIE_D);
		
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_MAISON ????
		Set<String> listeTypeBien = new LinkedHashSet<>();
		listeTypeBien.add(UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_MAISON);
		listeTypeBien.add(UtilitaireFiltre.IMMOBILIER_TYPE_BIEN_TERRAIN);
		
		// TODO FAIRE UNE CLASSE SPECIFIQUE : UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_ANCIEN ????
		Set<String> listeTypeVente = new LinkedHashSet<>();
		listeTypeVente.add(UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_ANCIEN);
		listeTypeVente.add(UtilitaireFiltre.IMMOBILIER_TYPE_VENTE_NEUF);

		AnnonceFiltreImmobilier annonceFiltreImmobilier = new AnnonceFiltreImmobilier();
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
		annonceFiltreImmobilier.setListeTypeBien(listeTypeBien);
		annonceFiltreImmobilier.setListeTypeVente(listeTypeVente);

		return ResponseEntity.ok("methodeDeTest_FiltreImmobilier");
	}
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public ResponseEntity<String> methodeDeTest_FiltreVehicule() {
		
		AnnonceFiltreVehicule annonceFiltreVehicule = new AnnonceFiltreVehicule();
		annonceFiltreVehicule.setPrixMinimum(null);
		annonceFiltreVehicule.setPrixMaximum(null);
		annonceFiltreVehicule.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreVehicule.setSiOffre(true);
		annonceFiltreVehicule.setSiVendeurParticulier(true);

		return ResponseEntity.ok("methodeDeTest_FiltreVehicule");
	}
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public ResponseEntity<String> methodeDeTest_FiltreMaison() {
		
		AnnonceFiltreMaison annonceFiltreMaison = new AnnonceFiltreMaison();
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

		return ResponseEntity.ok("methodeDeTest_FiltreMaison");
	}
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
	// TODO A SUPPRIMER ----------------------------------------------------------------------------------------------------
}
