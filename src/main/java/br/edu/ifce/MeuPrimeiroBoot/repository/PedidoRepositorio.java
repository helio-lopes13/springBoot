package br.edu.ifce.MeuPrimeiroBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.MeuPrimeiroBoot.model.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}
