package edu.utn.frro.ds.juguetes.controller;

import java.util.Collection; // Tipo Collection
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired; // @Autowired
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller; // @Controller
import org.springframework.web.bind.annotation.*; // @RequestMapping
import org.springframework.ui.Model; // Type Model

import edu.utn.frro.ds.juguetes.dao.*; // Tipo JugueteDAO
import edu.utn.frro.ds.juguetes.domain.*; // Tipo Juguete y Cliente


// ControladorPedidoJuguete --> Clase controlador del caso Juguetes
// [LRI 4/8/19]

@Controller
public class ControladorPedidoJuguete {
	@Autowired
	private JugueteDAO jDao; // Var Instancia (rol) jdao --> permite acceder al JugueteDAO
	@Autowired
	private PedidoDAO pDao; // Var Instancia (rol) pdao --> permite acceder al PedidoDAO	
	private static Cliente cActual = new Cliente("Juan","Perez", 2035L); // Crear el cliente actual que segun el C.U. ya está logueado. static porque viene prefijado al inicio del C.U.
	                                                                     // 2035L es un el nro.2035 de tipo Long (si no se coloca la L lo asume de tipo integer, y no ecuentra el método porque el constructor está definido para tipo Long)
	
	@RequestMapping("/buscarJug") // indica el path en la url web
	public String buscarJuguetes(Model model) {
		Collection<Juguete> l_juguetes = jDao.findAll(); // Recupera todos los juguetes
		model.addAttribute("colJuguetes", l_juguetes); // Cargar en el modelo que se envía a la vista la colección de colJuguetes
		return "buscarJug"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/buscarJug.html
	}
	
	@PostMapping("/seleccionarJuguete")
	public String seleccionarJuguete(@RequestParam(value="idJuguete", required=true)  Long  arg_idJuguete, Model model) {
				
		Pedido l_pedido; // Declara var local l_pedido
		
		Juguete l_juguete = jDao.getOne(arg_idJuguete); // Le pide al DAO el objeto juguete con el ID arg_idJuguete
		
		l_pedido=new Pedido();  // Create del Pedido
		l_pedido.inicializar(cActual, l_juguete);  // Inicializa el Pedido con el juguete que devolvió el DAO, y con la var. instancia cActual (cliente actual)
		//l_pedido.setIdPedido(12L); //Por motivos de DEBUG
		pDao.save(l_pedido); // Graba el pedido, y el DAO le asigna el ID
		
		model.addAttribute("mensaje", "Mostrando datos del juguete elegido");	// Este mensaje no está en el enunciado. Se coloca por si hay que hacer algún debug	
		model.addAttribute("juguete", l_juguete);  // Carga el juguete elegido al modelo
		model.addAttribute("cActual", cActual);    // Carga el cliente actual al modelo
		model.addAttribute("pedido", l_pedido);    // Carga el cliente actual al modelo
		return "confirmacion"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/confirmacion.html
	}

}
