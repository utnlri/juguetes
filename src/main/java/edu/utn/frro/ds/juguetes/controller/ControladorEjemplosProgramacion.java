package edu.utn.frro.ds.juguetes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.annotation.Scope;

import edu.utn.frro.ds.juguetes.domain.Pedido;

//GMODIF#1 - ControladorEjemplosProgramacion --> Este controlador está fuera del alcance del C.U. del enunciado de Repuestos.
//Se usa para mapear páginas html para hacer algunos ejemplos de programación, a revisar con alumnos
//[LRI 8/9/19]

@Controller
@Scope("session") // Con Scope session aisala las variables de instancia del Controlador entre distintas sesiones de Browser
public class ControladorEjemplosProgramacion {
	private String i_varInstanciaString;
	
	@RequestMapping("/ingresarVarInstancia") // indica el path en la url web
	public String ingresarVarInstancia(Model model) {
		return "ejProg/ingresarVarInstancia"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/ejProg/ingresarVarInstancia.html
	}
	
	@PostMapping("/setearVariable")
	public String setearVariable(@RequestParam(value="valorTexto", required=true)  String  arg_valorTexto, Model model) {
		i_varInstanciaString=arg_valorTexto;
		
		model.addAttribute("mensaje", "Mostrando datos guardados en la variable de instancia");	// Se coloca por si hay que hacer algún debug	
		model.addAttribute("varInstanciaString", this.i_varInstanciaString );  // Carga el valor de i_varInstanciaString	
		return "ejProg/confirmaVarInstancia"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/ejProg/confirmaVarInstancia.html
	      	
	}

	@RequestMapping("/mostrarVarInstancia") // indica el path en la url web
	public String consultarVarInstancia(Model model) {
		model.addAttribute("mensaje", "Mostrando el valor de variable de instancia");	// Se coloca por si hay que hacer algún debug	
		model.addAttribute("varInstanciaString", this.i_varInstanciaString );  // Carga el valor de i_varInstanciaString	
		
	    return "ejProg/mostrarVarInstancia"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/ejProg/mostrarVarInstancia.html
	}


}
