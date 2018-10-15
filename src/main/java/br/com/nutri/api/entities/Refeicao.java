package br.com.nutri.api.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nutri.api.enums.HorarioEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="refeicao")
public class Refeicao {
	
	@Id
	@Column(name="id_refeicao")
	@SequenceGenerator(name="refeicao_id_refeicao_seq", sequenceName="refeicao_id_refeicao_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="refeicao_id_refeicao_seq")
	@Getter @Setter
	private Long idRefeicao;
	
	@Getter @Setter
	private HorarioEnum horario;
	
	@Getter @Setter
	private String descricao;
	
	@Getter @Setter
	private String observacao;
	
	@ManyToMany
	@JoinTable(name = "refeicao_alimento", joinColumns = @JoinColumn(name = "id_refeicao"), inverseJoinColumns = @JoinColumn(name = "id_alimento"))
	@Getter @Setter
	private List<Alimento> alimentos;
}
