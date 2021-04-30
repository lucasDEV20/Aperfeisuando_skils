package com.osintegra.demo.api.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osintegra.demo.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		// Cliente cliente;
		// declarando lista de clientes
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Lucas Araujo da Silva");
		cliente1.setEmail("lucas1@teste.com");
		cliente1.setTelefone("62 9 0000-0000");
		
		var cliente2 = new Cliente();
        cliente2.setId(1L);
        cliente2.setNome("Joao Silva");
		cliente2.setEmail("Joao2@teste.com");
		cliente2.setTelefone("62 9 0000-0000");
		
		return Arrays.asList(cliente1, cliente2);

	}

}
