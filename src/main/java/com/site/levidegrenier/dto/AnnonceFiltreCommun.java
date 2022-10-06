package com.site.levidegrenier.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreCommun {

	private Integer prixMinimum;
	private Integer prixMaximum;
	private boolean siOffre;
	private boolean siAfficherSeulementAnnonceUrgente;
	private boolean siVendeurParticulier;
}
