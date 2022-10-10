package com.site.levidegrenier.dto.filtres.animaux;

import com.site.levidegrenier.dto.filtres.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreAnimaux extends AnnonceFiltreCommun {

	private String typeAnimal;
}
