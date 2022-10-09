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
	private Set<String> listeType;
	private Set<String> listeProduit;
	private Set<String> listeMatiere;
	private Set<String> listeColoris;
	private Set<String> listeEtat;
	private boolean siAnnonceDisponible;	// FIXME CA SERT A QUOI CONCRETEMENT ????? ===> si achat en cours ou non
	private boolean siDonUniquement;
}
