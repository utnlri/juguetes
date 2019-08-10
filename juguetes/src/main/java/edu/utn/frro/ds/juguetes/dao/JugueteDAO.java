package edu.utn.frro.ds.juguetes.dao;


import org.springframework.data.jpa.repository.JpaRepository; // Resuelve tipo JpaRepository
import org.springframework.stereotype.Repository; // Resuelve anotación @Repository

import edu.utn.frro.ds.juguetes.domain.Juguete; // Resuelve el tipo Juguete en el parámetro de JpaRepository

@Repository
public interface JugueteDAO extends JpaRepository<Juguete,Long> {

}
