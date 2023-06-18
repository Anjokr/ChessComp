package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "joga", schema = "public")
@IdClass(JogaId.class)
public class Joga {
	@Id
	@Column(name = "eidjogo")
	private Integer jogo;

	@Id
	@Column(name = "enumjogador")
	private Integer jogador;

	@ManyToOne
	@JoinColumn(name = "eidjogo", referencedColumnName = "idjogo", insertable = false, updatable = false)
	private Jogo jogoObj;

	@ManyToOne
	@JoinColumn(name = "enumjogador", referencedColumnName = "enumassoc", insertable = false, updatable = false)
	private Jogador jogadorObj;

	@Column(name = "cor")
	private String cor;

	public Integer getJogo() {
		return jogo;
	}

	public void setJogo(Integer jogo) {
		this.jogo = jogo;
	}

	public Integer getJogador() {
		return jogador;
	}

	public void setJogador(Integer jogador) {
		this.jogador = jogador;
	}

	public Jogo getJogoObj() {
		return jogoObj;
	}

	public void setJogoObj(Jogo jogoObj) {
		this.jogoObj = jogoObj;
	}

	public Jogador getJogadorObj() {
		return jogadorObj;
	}

	public void setJogadorObj(Jogador jogadorObj) {
		this.jogadorObj = jogadorObj;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}