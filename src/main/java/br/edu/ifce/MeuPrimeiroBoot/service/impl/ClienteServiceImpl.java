package br.edu.ifce.MeuPrimeiroBoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifce.MeuPrimeiroBoot.exception.ClienteMailNotFoundException;
import br.edu.ifce.MeuPrimeiroBoot.exception.ClienteNotFoundException;
import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroBoot.repository.ClienteRepositorio;
import br.edu.ifce.MeuPrimeiroBoot.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
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

}
