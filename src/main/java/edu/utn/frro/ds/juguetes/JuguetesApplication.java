package edu.utn.frro.ds.juguetes;

// Clase JuguetesApplication.java --> Clase inicial para levantar la aplicación del Caso Juguetes
// Ver documentación global en ue_DOCUMENTACION.md dentro de este proyecto
// Esta clase fue creada inicialmente por el Spring Initializr, con una cáscara vacía, que luego fue codificada
// [UTDC008 - LRI 3/8/19]

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired; // @Autowired 

import edu.utn.frro.ds.juguetes.dao.ClienteDAO;
import edu.utn.frro.ds.juguetes.dao.JugueteDAO; // Resuelve tipo JugueteDao
import edu.utn.frro.ds.juguetes.domain.*; // Tipo Juguete


@SpringBootApplication
public class JuguetesApplication {
	@Autowired private JugueteDAO jugueteDao;
	@Autowired
	private ClienteDAO cDao; // Var Instancia (rol) cdao --> permite acceder al ClienteDAO
	
	public static void main(String[] args) {
		SpringApplication.run(JuguetesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner cargarDatos() { 
		return (args) -> {
			// Esto código se ejecuta al inicializar la aplicación
			
			// Crear 3 objetos Juguete para guardar en el DAO
			Juguete l_munheca = new Juguete("Muñeca",202.50); 
			Juguete l_pelota_futbol = new Juguete("Pelota Futbol",1500.00);
			Juguete l_mickey = new Juguete("Mickey",3000.00);
			
			// Grabar los 3 objetos con el DAO
			jugueteDao.save(l_munheca);
			jugueteDao.save(l_pelota_futbol);
			jugueteDao.save(l_mickey);
			
			Cliente l_cte = new Cliente("Juan","Perez", 2035L); 
			cDao.save(l_cte);  // Este Cliente debe grabarse por cuestiones de integridad referencial para poder grabar pedidos
			
						
		};
	}

}
