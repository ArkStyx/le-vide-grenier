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
}
