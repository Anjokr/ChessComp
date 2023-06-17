package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "salao")
public class Salao {
	@Id
	@Column(name = "idsalao")
	private int idsalao;

	public int getIdSalao() {
		return idsalao;
	}

	public void setIdSalao(int idSalao) {
		this.idsalao = idSalao;
	}

	@Column(name = "capacidade")
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@ManyToOne
	@JoinColumn(name = "enomehotel")
	private Hotel hotel;

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
