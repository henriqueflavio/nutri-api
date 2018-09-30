package br.com.nutri.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;
import br.com.nutri.api.entities.Alimento;
import br.com.nutri.api.entities.Refeicao;
import br.com.nutri.api.repositories.AlimentoRepository;
import br.com.nutri.api.repositories.RefeicaoRepository;

@SpringBootApplication
public class NutriApiApplication {
	
	@Autowired
	AlimentoRepository alimentoRepository;
	
	@Autowired
	RefeicaoRepository refeicaoRepository;	
	
	
	public static void main(String[] args) {
		SpringApplication.run(NutriApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
		
//		Estado estado = new Estado();
//		estado.setDescricao("Pernambuco");
//		estadoRepository.save(estado);
		

//		Cidade cidade = new Cidade();
//		cidade.setIdCidade(1L);
//		cidade.setEstado(estado);
		
//		cidadeRepository.save(cidade);
		
		
//		Paciente paciente = new Paciente();
//		paciente.setNome("Flávio");
//		paciente.setCpf("08274477448");
//		paciente.setCidade(cidade);
//		paciente.setDataNascimento(LocalDate.now());
//		
//		pacienteRepository.save(paciente);
		
		Alimento alimento = new Alimento();
		alimento.setDescricao("batata");
		
		Alimento alimento2 = new Alimento();
		alimento2.setDescricao("batata2");
		
		List<Alimento> alimentos = new ArrayList<Alimento>();
		alimentos.add(alimento);
		alimentos.add(alimento2);
		
		Alimento alimento3 = new Alimento();
		alimento3.setDescricao("batata3");
		
		Alimento alimento4 = new Alimento();
		alimento4.setDescricao("batata4");
		
		List<Alimento> alimentos2 = new ArrayList<Alimento>();
		alimentos2.add(alimento3);
		alimentos2.add(alimento4);
		
		alimentoRepository.save(alimento);
		alimentoRepository.save(alimento2);
		alimentoRepository.save(alimento3);
		alimentoRepository.save(alimento4);
		
		Refeicao refeicao1 = new Refeicao();
		refeicao1.setDescricao("cafedamanha");
		refeicao1.setAlimentos(alimentos);
		
		Refeicao refeicao2 = new Refeicao();
		refeicao2.setDescricao("almoco");
		refeicao2.setAlimentos(alimentos2);
		
		refeicaoRepository.save(refeicao1);
		refeicaoRepository.save(refeicao2);
		
		
		
		
	
			
		};
	}
}
