package com.site.levidegrenier.dto.annonce.filtre.maison;

import java.util.Set;

import com.site.levidegrenier.dto.annonce.filtre.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreMaison extends AnnonceFiltreCommun {

	private boolean siAfficherAnnonceAvecLivraison;
	private Set<String> listeType;
	private Set<String> listeProduit;
	private Set<String> listeMatiere;
	private Set<String> listeColoris;
	private Set<String> listeEtat;
	private boolean siAnnonceDisponible;
	private boolean siDonUniquement;
}
