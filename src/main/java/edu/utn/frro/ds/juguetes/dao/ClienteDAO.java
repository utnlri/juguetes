package edu.utn.frro.ds.juguetes.dao;

// Clase  ClienteDAO --> aunque en el C.U. el cliente esté como precondición, es necesario tener un DAO para que esté grabado en la B.D.
//  por motivos de Integridad referencial al momento de grabar el Pedido
// [LRI 4/8/19]

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.utn.frro.ds.juguetes.domain.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Long> {

}