package com.site.levidegrenier.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.levidegrenier.dto.filtre.AnnonceFiltreAnimaux;
import com.site.levidegrenier.utilities.UtilitaireFiltre;

@Controller
@RequestMapping("le-vide-grenier")
public class LeVideGrenierController {

	public ResponseEntity<String> coucou() {
		return ResponseEntity.ok("Coucou !");
	}
	
	
	// TODO A SUPPRIMER - METHODE DE TEST
	public ResponseEntity<String> methodeDeTest() {
		
		AnnonceFiltreAnimaux annonceFiltreAnimaux = new AnnonceFiltreAnimaux();
		annonceFiltreAnimaux.setPrixMaximum(0);
		annonceFiltreAnimaux.setPrixMinimum(0);
		annonceFiltreAnimaux.setSiAfficherSeulementAnnonceUrgente(false);
		annonceFiltreAnimaux.setSiOffre(true);
		annonceFiltreAnimaux.setSiVendeurParticulier(true);
		annonceFiltreAnimaux.setTypeAnimal(UtilitaireFiltre.ANIMAUX_CHIEN);
		
		return ResponseEntity.ok("Methode de test");
	}
	
}
