package br.com.nutri.api.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nutri.api.enums.EstadoCivilEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="paciente")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = -8782878380575171426L;

	@Id
	@Column(name="id_paciente")
	@SequenceGenerator(name="paciente_id_paciente_seq", 
	   				   sequenceName="paciente_id_paciente_seq", 
	   				   allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
					generator="paciente_id_paciente_seq")
	@Getter @Setter
	private Long idPaciente;
		
	@OneToOne
	@JoinColumn(name="idCidade")
	@Getter @Setter
	private Cidade cidade;
	
	@Getter @Setter
	private String nome;
	
	@Column(name="data_nascimento")
	@Getter @Setter
	private LocalDate dataNascimento;
	
	@Getter @Setter
	private String sexo;
	
	@Getter @Setter
	private String email;
	
	@Getter @Setter
	private String telefone;
	
	@Column(name="estado_civil")
	@Getter @Setter
	private EstadoCivilEnum estadoCivil;
	
	@Getter @Setter
	private String ocupacao;
	
	@Getter @Setter
	private String cpf;
	
	@Getter @Setter
	private String cep;
	
	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private String numero;
	
	@Getter @Setter
	private String complemento;

	@Getter @Setter
	private String bairro;

	@Getter @Setter
	private String observacao;
}
