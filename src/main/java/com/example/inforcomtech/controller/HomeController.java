package com.example.inforcomtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	//creaos un modelo para podrer mostrarlo en home.html
	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Hola Bienvenidos Puntual CCare App");
		
		
		return "home";
	}

}
