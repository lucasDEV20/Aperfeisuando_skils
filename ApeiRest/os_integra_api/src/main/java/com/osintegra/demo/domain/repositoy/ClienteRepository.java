package com.osintegra.demo.domain.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osintegra.demo.domain.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	
/*
 * @author : LucasDev20
 * Description : interface do repositorio de clientes, 
 * que e estendida pela classe controladora Cliente.
 *  
 *
 */
List<Cliente> findByName(String nome);
List<Cliente> fimdByNameContaining(String nome);

   

}
