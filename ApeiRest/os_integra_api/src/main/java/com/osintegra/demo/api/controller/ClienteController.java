package com.osintegra.demo.api.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osintegra.demo.domain.model.Cliente;
import com.osintegra.demo.domain.repositoy.ClienteRepository;

/*
 * @Author LucasDev20
 * Description > classe que mapeia 
 * 
 */

/**
 * 
 * @author Computador
 *
 */
@RestController
public class ClienteController {

    @Autowired	
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
    return clienteRepository.findAll();
   //  return clienteRepository.findByNameContaining("si");
	   
	}
	
	@GetMapping("/clientes/{clienteid}")
	public Cliente buscar() {
		
	}

}
