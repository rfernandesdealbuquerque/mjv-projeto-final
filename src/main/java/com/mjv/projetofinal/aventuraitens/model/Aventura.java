package com.mjv.projetofinal.aventuraitens.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aventuras")
public class Aventura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aventura_id")
	private Integer id;
	
	@Column(name="nome_aventura")
	private String nomeAventura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeAventura() {
		return nomeAventura;
	}

	public void setNomeAventura(String nomeAventura) {
		this.nomeAventura = nomeAventura;
	}
	
	
	
}
