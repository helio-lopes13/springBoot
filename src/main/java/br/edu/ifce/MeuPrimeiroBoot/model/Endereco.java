package br.edu.ifce.MeuPrimeiroBoot.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String logradouro;
	
	private int numero;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
