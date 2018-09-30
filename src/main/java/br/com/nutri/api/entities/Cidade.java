package br.com.nutri.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cidade")
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 2231495148004479295L;

	@Id
	@Column(name="id_cidade")
	@SequenceGenerator(name="cidade_id_cidade_seq", sequenceName="cidade_id_cidade_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cidade_id_cidade_seq")
	@Getter @Setter
	private Long idCidade;
	
	@OneToOne
	@JoinColumn(name="idEstado")
	@Getter @Setter
	private Estado estado;
	
	@Getter @Setter
	private String descricao;
}
