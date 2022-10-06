package com.site.levidegrenier.dto.filtre;

import com.site.levidegrenier.dto.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreImmobilier extends AnnonceFiltreCommun {

	private String typeDeBien;
	private String typeDeVente;
	private int surfaceHabitableMinimum;
	private int surfaceHabitableMaximum;
	private int surfaceTerrainMinimum;
	private int surfaceTerrainMaximum;
	private int nombreDePieces;
	private String classeEnergie;
}
