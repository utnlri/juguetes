package edu.utn.frro.ds.juguetes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControladorHome {
	
	@RequestMapping("/") // indica el path en la url web
	public String home(Model model) {
		return "home"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/home.html
	}

}
