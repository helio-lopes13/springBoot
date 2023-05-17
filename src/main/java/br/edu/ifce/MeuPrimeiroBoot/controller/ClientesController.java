package br.edu.ifce.MeuPrimeiroBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroBoot.service.impl.ClienteService;

@RequestMapping("/cliente")
public class ClientesController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/cadastrar")
	public String telaCadastro() {
		return "/cliente/cadastro";
	}
	
	@GetMapping("/listar")
	public String telaListar(ModelMap model) {
		model.addAttribute("clients", service.buscarTodos());
		return "/cliente/lista";
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
		cliente = service.salvar(cliente);
		return ResponseEntity.ok(cliente);
	}
}
