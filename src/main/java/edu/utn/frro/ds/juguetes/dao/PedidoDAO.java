package edu.utn.frro.ds.juguetes.dao;

import org.springframework.data.jpa.repository.JpaRepository; // Resuelve tipo JpaRepository
import org.springframework.stereotype.Repository; // Resuelve anotación @Repository

import edu.utn.frro.ds.juguetes.domain.Pedido;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido,Long> {

}
