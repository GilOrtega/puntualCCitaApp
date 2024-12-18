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
	
	/*
	 * Metodo para mostrar la lista en una tabla html 
	 */
	
	@GetMapping("/tablaServicios")
	public String mostrarTabla(Model model) {
		List<Servicio> lista = getServicios();
		model.addAttribute("servicios" , lista);
		
		return "tablaServicios";
		
		
	}
	
	

	// mostrarDetalle de servicio que ofrece el negocio , en este metodo creamos un
	// objeto de tipo servicio y mlo agregamos a nuestro modelo
	// y lo renderizamos la lista en nuestra vista
	@GetMapping("/detalleServicio")
	public String mostrarDetalle(Model model) {
		Servicio servicio = new Servicio();
		servicio.setId(1);
		servicio.setNombre("Corte de cabello");
		servicio.setDescripcion(
				"Renueva tu estilo con un corte de cabello personalizado según tus preferencias. Nuestros expertos estilistas están listos para asesorarte y crear un look que se ajuste a tu personalidad y necesidades. ¡Elige tu cita y transforma tu imagen!");
		servicio.setPrecio(150.00);

		model.addAttribute("servicio", servicio);

		return "detalleServicio";

	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de contabilidad");
		lista.add("Arquitecto");
		lista.add("Vendedor");

		model.addAttribute("servicios", lista);

		return "listado";

	}

	// creaos un modelo para podrer mostrarlo en home.html
	@GetMapping("/")
	public String mostrarHome(Model model) {
		/*
		 * model.addAttribute("mensaje", "Hola Bienvenidos Puntual CCare App");
		 * model.addAttribute("fecha", new Date());
		 */

		String nombre = "Auxiliar de contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;

		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}

	/*
	 * Metodo que regresa una lista de objetos de tipo Servicio
	 */
	private List <Servicio> getServicios() {
		
		List<Servicio> lista = new LinkedList<Servicio>();
		
		try {
			
			//creamos el servicio numero 1 que ofrece el consultorio 
			Servicio servicio1 = new Servicio();
			servicio1.setId(1);
			servicio1.setNombre("Revision y diagnostico");
			servicio1.setDescripcion(". El dentista realiza una "
					+ "inspección visual de los dientes, encías y boca, buscando señales de caries, "
					+ "enfermedades periodontales u otros problemas. En muchos casos, se complementa con "
					+ "radiografías dentales para detectar problemas ocultos, como caries interdentales, infecciones o"
					+ " pérdida ósea. ");
			servicio1.setPrecio(300.00);
			
			//creamos el servicio numero 2 que ofrece el consultorio 
			Servicio servicio2 = new Servicio();
			servicio2.setId(2);
			servicio2.setNombre("Limpieza dental profesional ");
			servicio2.setDescripcion(". Este servicio consiste en la eliminación de placa bacteriana, sarro y manchas "
					+ "superficiales de los dientes mediante técnicas"
					+ " avanzadas. Ayuda a prevenir caries, gingivitis y otros problemas bucales, además de mantener"
					+ " una sonrisa limpia y saludable. ");
			servicio2.setPrecio(300.00);
			
			//creamos el servicio numero 3 que ofrece el consultorio 
			Servicio servicio3 = new Servicio();
			servicio3.setId(3);
			servicio3.setNombre("Tratamiento de caries");
			servicio3.setDescripcion(". Consiste en la eliminación de la caries dental y la restauración del diente afectado"
					+ " con materiales de alta calidad, como resinas o amalgamas, para devolverle su función y apariencia natural. ");
			servicio3.setPrecio(450.00);
			
			//creamos el servicio numero 4 que ofrece el consultorio 
			Servicio servicio4 = new Servicio();
			servicio4.setId(4);
			servicio4.setNombre("Extracciones dentales");
			servicio4.setDescripcion("Este servicio consiste en la"
					+ " remoción de dientes dañados, deteriorados o que no tienen posibilidad de ser reparados.");
			servicio4.setPrecio(300.00);
			
			
			/*
			 * Agregamos los 4 objetos de tipo servicio a la lista 
			 */
			lista.add(servicio1);
			lista.add(servicio2);
			lista.add(servicio3);
			lista.add(servicio4);
			
		
			
			
		} catch (Exception e) {
			System.out.println("Error inesperado: " + e.getMessage());
		}
		return lista;
			
			
			
			
			
			
			
			
		
		
	}

}
