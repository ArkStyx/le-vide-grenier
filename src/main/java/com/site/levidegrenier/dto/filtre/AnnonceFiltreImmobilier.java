package com.site.levidegrenier.dto.filtre;

import java.util.Set;

import com.site.levidegrenier.dto.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreImmobilier extends AnnonceFiltreCommun {

	private Set<String> listeTypeDeBien;
	private Set<String> listeTypeDeVente;
	private Integer surfaceHabitableMinimum;
	private Integer surfaceHabitableMaximum;
	private Integer surfaceTerrainMinimum;
	private Integer surfaceTerrainMaximum;
	private Integer nombreDePieces;
	private Set<String> listeClasseEnergie;
}
