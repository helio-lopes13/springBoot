package br.edu.ifce.MeuPrimeiroBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.MeuPrimeiroBoot.exception.ClienteMailNotFoundException;
import br.edu.ifce.MeuPrimeiroBoot.exception.ClienteNotFoundException;
import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroBoot.repository.ClienteRepositorio;
import br.edu.ifce.MeuPrimeiroBoot.service.ClienteServiceInterface;

@Service
public class ClienteService implements ClienteServiceInterface {
	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public Cliente buscarPorId(Long id) {
		return repositorio.findById(id).orElseThrow(() -> new ClienteNotFoundException(id));
	}

	@Override
	public Cliente buscarPorEmail(String email) {
		return repositorio.findByEmail(email).orElseThrow(() -> new ClienteMailNotFoundException(email));
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public List<Cliente> buscarTodos() {
		return repositorio.findAll();
	}

}
