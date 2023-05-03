package br.edu.ifce.MeuPrimeiroBoot.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.ifce.MeuPrimeiroBoot.model.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
	@Query("SELECT c FROM Cliente c WHERE c.email = :email")
	Optional<Cliente> findByEmail(String email);
	
	@Query("SELECT c FROM Cliente c ORDER BY c.nome")
	List<Cliente> buscarClientesOrdenados();
	
	@Query("SELECT c FROM Cliente c WHERE c.dataNascimento > :data")
	List<Cliente> idadeMaiorQue(LocalDate data);
}
