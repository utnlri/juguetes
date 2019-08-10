package edu.utn.frro.ds.juguetes.domain;

import javax.persistence.Entity; // Se agrega automático al copiar la anotación @Entity
import javax.persistence.GeneratedValue; // Se agrega automático al copiar la anotación @id
import javax.persistence.Id; // Se agrega automático al copiar la anotación @GeneratedValue 

@Entity
public class Cliente {
	@Id                           // Se comenta @GeneratedValue, porque por ser precondición se va a usar un ID explícitamente asignado 
	private Long idCliente;
	private String nombre;
	private String apellido;

	public Cliente() {
		
	} 
	// Esto en Java equivale a un Create, seguido de un inicializar con los argumentos descripción y precio
	// Como en este C.U. el Cliente aparece como pre-condicion el ID no será seteado por el DAO, y debe pasarse en el constructor
	public Cliente( String arg_nombre, String  arg_apellido, Long arg_idCliente ) {
		this.nombre=arg_nombre;
		this.apellido=arg_apellido;
		this.idCliente=arg_idCliente;		
	}
	public Long getIdCliente() {
		return this.idCliente;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	


}
