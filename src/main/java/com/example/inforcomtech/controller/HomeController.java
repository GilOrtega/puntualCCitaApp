package com.example.inforcomtech.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.inforcomtech.puntualCCitaApp.model.Servicio;

@Controller
public class HomeController {
	
	
	//mostrarDetalle de servicio que ofrece el negocio 
	@GetMapping("/detalleServicio")
	public String mostrarDetalle(Model model) {
		Servicio servicio = new Servicio();
		servicio.setNombre("Corte de cabello");
		servicio.setDescripcion("Renueva tu estilo con un corte de cabello personalizado según tus preferencias. Nuestros expertos estilistas están listos para asesorarte y crear un look que se ajuste a tu personalidad y necesidades. ¡Elige tu cita y transforma tu imagen!");
		servicio.setPrecio(150.00);
		
		model.addAttribute("servicio", servicio);
		
		
		return "detalleServicio";
		
		
		
	}
	
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista= new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de contabilidad");
		lista.add ("Arquitecto");
		lista.add("Vendedor");
		
		
		model.addAttribute("servicios", lista);
		
		return "listado";
		
	
		
	}
	//creaos un modelo para podrer mostrarlo en home.html
	@GetMapping("/")
	public String mostrarHome(Model model) {
		/*
		model.addAttribute("mensaje", "Hola Bienvenidos Puntual CCare App");
		model.addAttribute("fecha", new Date());
		*/
		
		String nombre = "Auxiliar de contabilidad" ;
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
		return "home";
	}

}
