package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexContollerCliente {

	@GetMapping("/dash")
	public String mostrarIndex() {
			
		return "/Cliente/index";
	}
	
	@GetMapping("/principal")
	public String mostrarInicio() {
			
		return "/Cliente/indexCuerpo";
	}
	
	
}
