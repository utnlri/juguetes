package edu.utn.frro.ds.juguetes.domain;

import javax.persistence.Entity; // Se agrega automático al escribir la anotación @Entity
import javax.persistence.GeneratedValue; // Se agrega automático al escribir la anotación @id
import javax.persistence.Id; // Se agrega automático al escribir la anotación @GeneratedValue 

@Entity
public class Juguete {
	@Id @GeneratedValue 
	private Long idJuguete;
	private String descripcion;
	private Double  precio;
	
	public Juguete() {} // Default Constructor --> es necesario para que e FindAll no de error 
	
	// Esto en Java equivale a un Create, seguido de un inicializar con los argumentos descripción y precio
	public Juguete(String arg_descripcion,Double  arg_precio ) {
		this.descripcion=arg_descripcion;
		this.precio=arg_precio;
	}
	public Long getIdJuguete() {
		return this.idJuguete;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public Double getPrecio() {
		return this.precio;
	}

}
