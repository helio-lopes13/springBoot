package br.edu.ifce.MeuPrimeiroBoot.exception;

public class ClienteNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClienteNotFoundException(Long id) {
		super("Não foi possível encontrar cliente com id " + id);
	}
}
