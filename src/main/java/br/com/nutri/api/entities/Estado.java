package br.com.nutri.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 9129150506760734767L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_estado")
	@Getter @Setter
	private Long idEstado;
	
	@Getter @Setter
	private String descricao;

}
