package br.edu.ifce.MeuPrimeiroBoot.service;

import org.springframework.stereotype.Service;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;

@Service
public interface ClienteService {
	Cliente buscarPorId(Long id);
	
	Cliente buscarPorEmail(String email);
}
