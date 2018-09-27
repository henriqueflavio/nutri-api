package br.com.nutri.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nutri.api.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
