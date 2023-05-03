package br.edu.ifce.MeuPrimeiroBoot.service;

import java.util.List;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;

public interface ClienteServiceInterface {
	Cliente buscarPorId(Long id);
	
	Cliente buscarPorEmail(String email);
	
	Cliente salvar(Cliente cliente);
	
	List<Cliente> buscarTodos();
}
