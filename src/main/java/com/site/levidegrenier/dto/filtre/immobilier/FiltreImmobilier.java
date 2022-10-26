package com.site.levidegrenier.dto.filtre.immobilier;

import java.util.Set;

import com.site.levidegrenier.dto.filtre.FiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FiltreImmobilier extends FiltreCommun {

	private Set<String> listeTypeBienImmobilier;
	private Set<String> listeTypeVenteImmobiliere;
	private Integer surfaceHabitableMinimum;
	private Integer surfaceHabitableMaximum;
	private Integer surfaceTerrainMinimum;
	private Integer surfaceTerrainMaximum;
	private Integer nombreDePieces;
	private Set<String> listeClasseEnergie;
}
