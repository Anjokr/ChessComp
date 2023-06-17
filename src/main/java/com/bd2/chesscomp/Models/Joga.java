package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "joga")
public class Joga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idjoga")
	private int idjoga;

	@ManyToOne
	@JoinColumn(name = "eidjogo")
	private Jogo jogo;

	@ManyToOne
	@JoinColumn(name = "enumjogador")
	private Jogador jogador;

	@Column(name = "cor")
	private String cor;

	public int getEidjogo() {
		return idjoga;
	}

	public void setEidjogo(int eidjogo) {
		this.idjoga = eidjogo;
	}

	public Jogador getEnumjogador() {
		return jogador;
	}

	public void setEnumjogador(Jogador enumjogador) {
		this.jogador = enumjogador;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}