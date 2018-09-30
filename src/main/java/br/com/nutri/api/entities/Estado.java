package br.com.nutri.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 9129150506760734767L;
	
	@Id
	@Column(name="id_estado")
	@SequenceGenerator(name="estado_id_estado_seq", sequenceName="estado_id_estado_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estado_id_estado_seq")
	@Getter @Setter
	private Long idEstado;
	
	@Getter @Setter
	private String descricao;

}
