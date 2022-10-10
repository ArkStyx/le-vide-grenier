package com.site.levidegrenier.dto.filtres.immobilier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreLocation extends AnnonceFiltreImmobilier {

	private boolean siMeublee;
}
