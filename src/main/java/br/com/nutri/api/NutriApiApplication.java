package br.com.nutri.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.nutri.api.entities.Cidade;
import br.com.nutri.api.entities.Paciente;
import br.com.nutri.api.repositories.CidadeRepository;
import br.com.nutri.api.repositories.EstadoRepository;
import br.com.nutri.api.repositories.PacienteRepository;

@SpringBootApplication
public class NutriApiApplication {
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NutriApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
		
//		Estado estado = new Estado();
//		estado.setDescricao("Pernambuco");
//		estadoRepository.save(estado);
		

		Cidade cidade = new Cidade();
		cidade.setIdCidade(1L);
//		cidade.setEstado(estado);
		
//		cidadeRepository.save(cidade);
		
		
		Paciente paciente = new Paciente();
		paciente.setNome("Flávio");
		paciente.setCpf("08274477448");
		paciente.setCidade(cidade);
		paciente.setDataNascimento(LocalDate.now());
		
		pacienteRepository.save(paciente);
			
		};
	}
}
