package br.edu.ifce.MeuPrimeiroBoot.exception;

public class ClienteMailNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClienteMailNotFoundException(String email) {
		super("Não foi possível encontrar cliente com e-mail " + email);
	}
}
