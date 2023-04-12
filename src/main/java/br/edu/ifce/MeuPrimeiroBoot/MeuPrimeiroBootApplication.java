package br.edu.ifce.MeuPrimeiroBoot;

import java.time.LocalDate;

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
		cliente.setNome("Faríseu Alado dos Santos da Paiva Mota Nunes Valente da Silva");
		cliente.setTelefone("(85) 98763-4875");
		
		LocalDate data = LocalDate.of(1983, 12, 20);
		cliente.setDataNascimento(data);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Alameda dos Anjos");
		endereco.setNumero(547);
		
		cliente.setEndereco(endereco);
		
		clienteRepositorio.save(cliente);
	}

	
}
