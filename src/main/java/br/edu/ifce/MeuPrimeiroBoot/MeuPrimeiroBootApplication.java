package br.edu.ifce.MeuPrimeiroBoot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroBoot.model.Endereco;
import br.edu.ifce.MeuPrimeiroBoot.repository.ClienteRepositorio;

@SpringBootApplication
public class MeuPrimeiroBootApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("Farísia Alada dos Santos da Paiva Mota");
		cliente.setTelefone("(85) 98763-4875");
		cliente.setDtNascimento(new Date(1983, 04, 15));
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Alameda dos Anjos");
		endereco.setNumero(547);
		
		cliente.setEndereco(endereco);
		
		clienteRepositorio.save(cliente);
	}

	
}
