package edu.utn.frro.ds.juguetes.domain;

import java.util.*; // Tipo Date

import javax.persistence.*; // Por @Entity , @Id , @GeneratedValue

@Entity
public class Pedido {
	@Id @GeneratedValue
	private Long idPedido;
	@ManyToOne private Cliente cliente;  // Se requiere @ManyToOne para indicar relación con otra tabla de Hibernate (sin esta anotación da error "Could not determine type for: edu.utn.frro.ds.juguetes.domain.Cliente, at table: pedido,"  al arrancar la aplicación)
	@ManyToOne private Juguete juguete;  // Se requiere @ManyToOne para indicar relación con otra tabla de Hibernate (sin esta anotación da error "Could not determine type for: edu.utn.frro.ds.juguetes.domain.Juguete, at table: pedido,"  al arrancar la aplicación)
	private Date fecha;
	
	public Pedido() { // Constructor default
		
	}
	
	public void inicializar(Cliente arg_cliente, Juguete arg_juguete) {
		Date l_today = new Date(); // Inicializa la var. local l_today con la fecha de hoy 
		
		this.cliente=arg_cliente;
		this.juguete=arg_juguete;
		this.fecha=l_today;
				
	}
	
	public Long getIdPedido() {
		return this.idPedido;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public Juguete getJuguete() {
		return this.juguete;
	}
	public Date getFecha() {
		return this.fecha;
	}
	
	public void  setIdPedido(Long arg_id) {
		this.idPedido=arg_id;
	}

}
