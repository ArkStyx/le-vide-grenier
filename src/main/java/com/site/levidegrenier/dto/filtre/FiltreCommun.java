package com.site.levidegrenier.dto.filtre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FiltreCommun {

	private Integer prixMinimum;
	private Integer prixMaximum;
	private boolean siOffre;
	private boolean siAfficherSeulementAnnonceUrgente;
	private boolean siVendeurParticulier;
}
