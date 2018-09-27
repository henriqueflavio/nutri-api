package br.com.nutri.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nutri.api.entities.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
