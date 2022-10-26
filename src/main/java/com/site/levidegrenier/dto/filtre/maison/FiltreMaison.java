package com.site.levidegrenier.dto.filtre.maison;

import java.util.Set;

import com.site.levidegrenier.dto.filtre.FiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FiltreMaison extends FiltreCommun {

	private boolean siAfficherAnnonceAvecLivraison;
	private Set<String> listeType;
	private Set<String> listeProduit;
	private Set<String> listeMatiere;
	private Set<String> listeColoris;
	private Set<String> listeEtat;
	private boolean siAnnonceDisponible;
	private boolean siDonUniquement;
}
