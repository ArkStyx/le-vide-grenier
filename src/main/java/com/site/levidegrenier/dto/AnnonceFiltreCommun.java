package com.site.levidegrenier.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreCommun {

	private String categorie;
	private int prixMinimum;
	private int prixMaximum;
	private boolean siOffre;
	private boolean siAnnonceUrgente;
	private boolean siVendeurParticulier;
}
