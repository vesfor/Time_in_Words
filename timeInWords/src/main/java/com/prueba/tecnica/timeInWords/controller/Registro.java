package com.prueba.tecnica.timeInWords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.tecnica.timeInWords.model.Time;
import com.prueba.tecnica.timeInWords.model.service.TimeService;


/**
 * Clase que controla el registro de tiempo
 * @author vfs
 *
 */
@Controller
@RequestMapping("app")
public class Registro {
	
	@Autowired
	private TimeService tiempoService;
	private String palabra;
	
	/**
	 * Metodo que muestra el resultado de la hora y minutos en palabras 
	 * @param model
	 * @return
	 */
	@GetMapping(value= {"/Resultados","/"})
	public String showResultado(Model model) {
		model.addAttribute("tiempo", new Time());
		model.addAttribute("palabras", palabra);
		return "Resultados";
	}
	
	/**
	 * Servicio que guarda los datos del formulario en la BD jdbc:h2:mem:sed
	 * en la tabla Tiempo
	 * @param tiempo
	 * @param model
	 * @return
	 */
	@PostMapping("/Resultados")
	public String saveRegistros(Time tiempo, Model model) {
//		if(!tiempo.getHora().isEmpty() || !tiempo.getLastName().isEmpty())
		palabra = tiempoService.TimeWords(tiempo.getHora(), tiempo.getMinutos());
		tiempo.setPalabras(palabra);
		tiempoService.create(tiempo);
		
		return "redirect:Resultados";
	}
	
}