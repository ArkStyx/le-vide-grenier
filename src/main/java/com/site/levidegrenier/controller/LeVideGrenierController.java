package com.site.levidegrenier.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("le-vide-grenier")
public class LeVideGrenierController {

	public ResponseEntity<String> coucou() {
		return ResponseEntity.ok("Coucou !");
	}
	
}
