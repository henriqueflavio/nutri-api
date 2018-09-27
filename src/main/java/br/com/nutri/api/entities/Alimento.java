package br.com.nutri.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="alimento")
public class Alimento {
	
	@Id
	@Column(name="id_alimento")
	@SequenceGenerator(name="alimento_id_alimento_seq", sequenceName="alimento_id_alimento_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="alimento_id_alimento_seq")
	@Getter @Setter
	private Long idAlimento;
	
	@Getter @Setter
	private String descricao;
	
	@Getter @Setter
	private Integer quantidade;
	
	@Getter @Setter
	private String medida;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy="alimentos")
	private List<Refeicao> refeicoes;
}
