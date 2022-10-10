package com.site.levidegrenier.dto.annonce.filtre.animal;

import com.site.levidegrenier.dto.annonce.filtre.AnnonceFiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnnonceFiltreAnimaux extends AnnonceFiltreCommun {

	private String typeAnimal;
}
