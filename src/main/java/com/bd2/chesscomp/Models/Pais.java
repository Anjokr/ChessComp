package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {
	@Id
	@Column(name = "numpais")
	private int numPais;

	public int getNumPais() {
		return numPais;
	}

	public void setNumPais(int numPais) {
		this.numPais = numPais;
	}

	@Column(name = "nome")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}