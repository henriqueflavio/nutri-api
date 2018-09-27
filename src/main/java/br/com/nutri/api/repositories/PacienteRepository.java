package br.com.nutri.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nutri.api.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
