package com.site.levidegrenier.dto.filtre.animal;

import com.site.levidegrenier.dto.filtre.FiltreCommun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FiltreAnimaux extends FiltreCommun {

	private String typeAnimal;
}
