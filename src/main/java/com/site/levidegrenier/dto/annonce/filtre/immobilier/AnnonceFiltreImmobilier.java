package com.site.levidegrenier.dto.annonce.filtre.immobilier;

import java.util.Set;

import com.site.levidegrenier.dto.annonce.filtre.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreImmobilier extends AnnonceFiltreCommun {

	private Set<String> listeTypeBien;
	private Set<String> listeTypeVente;
	private Integer surfaceHabitableMinimum;
	private Integer surfaceHabitableMaximum;
	private Integer surfaceTerrainMinimum;
	private Integer surfaceTerrainMaximum;
	private Integer nombreDePieces;
	private Set<String> listeClasseEnergie;
}