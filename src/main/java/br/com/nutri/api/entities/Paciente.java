package br.com.nutri.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.nutri.api.enums.EstadoCivilEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="paciente")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = -8782878380575171426L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Getter @Setter
	
	@Column(name="id_paciente")
	private Long idPaciente;
	
	@OneToOne(mappedBy="idCidade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Column(name="id_cidade")
	@Getter @Setter
	private Long idCidade;
	
	@Column(name="data_nascimento")
	@Getter @Setter
	private Date dataNascimento;
	
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
