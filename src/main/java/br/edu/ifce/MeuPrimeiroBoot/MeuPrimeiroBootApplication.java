package br.edu.ifce.MeuPrimeiroBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroBoot.repository.ClienteRepositorio;
import br.edu.ifce.MeuPrimeiroBoot.repository.PedidoRepositorio;

@SpringBootApplication
public class MeuPrimeiroBootApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Autowired
	private PedidoRepositorio pedidoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Faríseu Alado dos Santos da Paiva Mota Nunes Valente da Silva");
//		cliente.setTelefone("(85) 98763-4875");
//		cliente.setEmail("faris.eu@gmail.com");
//
//		LocalDate data = LocalDate.of(1983, 12, 20);
//		cliente.setDataNascimento(data);
//
//		Endereco endereco = new Endereco();
//		endereco.setLogradouro("Alameda dos Anjos");
//		endereco.setNumero(547);
//
//		cliente.setEndereco(endereco);
//
//		Produto produto1 = new Produto();
//		produto1.setNome("Maçã");
//		produto1.setDescricao("Uma maçã");
//		produto1.setFoto("maca.png");
//
//		Produto produto2 = new Produto();
//		produto2.setNome("Banana");
//		produto2.setDescricao("Uma banana");
//		produto2.setFoto("banana.png");
//
//		Produto produto3 = new Produto();
//		produto3.setNome("Farinha");
//		produto3.setDescricao("Uma farinha");
//		produto3.setFoto("farinha.png");
//
//		clienteRepositorio.save(cliente);
//
//		Pedido pedido1 = new Pedido();
//		pedido1.setCliente(cliente);
//		pedido1.setProdutos(Arrays.asList(produto1, produto2, produto3));
//
//		Pedido pedido2 = new Pedido();
//		pedido2.setCliente(cliente);
//		pedido2.setProdutos(Arrays.asList(produto1, produto3));
//
//		pedidoRepositorio.saveAll(Arrays.asList(pedido1, pedido2));
	}

}
