package br.edu.ifce.MeuPrimeiroBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.MeuPrimeiroBoot.model.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
