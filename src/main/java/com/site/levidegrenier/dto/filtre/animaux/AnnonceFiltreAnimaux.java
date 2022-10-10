package com.site.levidegrenier.dto.filtre.animaux;

import com.site.levidegrenier.dto.filtre.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreAnimaux extends AnnonceFiltreCommun {

	private String typeAnimal;
}
