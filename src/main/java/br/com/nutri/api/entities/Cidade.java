package br.com.nutri.api.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cidade")
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 2231495148004479295L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_cidade")
	@OneToOne(mappedBy="idPaciente", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@Getter @Setter
	private Long idCidade;
	
	@OneToOne(mappedBy = "idEstado", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@Getter @Setter
	private Long idEstado;
	
	@Getter @Setter
	private String descricao;
}
