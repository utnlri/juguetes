package edu.utn.frro.ds.juguetes.controller;

// ControladorListarPedidos --> Este controlador está fuera del alcance del C.U. del enunciado de Juguete.
//    Se usa para poder ver el listado completo de los pedidos generados durante la ejecución del ejercicio
// [LRI 4/8/19]

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.utn.frro.ds.juguetes.dao.PedidoDAO;
import edu.utn.frro.ds.juguetes.domain.Pedido;

@Controller
public class ControladorListarPedidos {
	@Autowired
	private PedidoDAO pDao; // Var Instancia (rol) pdao --> permite acceder al PedidoDAO
	
	@RequestMapping("/listarPedidos") // indica el path en la url web
	public String buscarJuguetes(Model model) {
		Collection<Pedido> l_pedidos = pDao.findAll(); // Recupera todos los pedidos
		model.addAttribute("colPedidos", l_pedidos); // Cargar en el modelo que se envía a la vista la colección de colPedidos
		return "listarPedidos"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/listarPedidos.html
	}

}
