package br.edu.ifce.MeuPrimeiroBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroBoot.service.impl.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClientesController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<?> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
		cliente = service.salvar(cliente);
		return ResponseEntity.ok(cliente);
	}
}
