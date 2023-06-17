package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "nomehotel")
    private String nomehotel;

    @Column(name = "endhotel")
    private String endhotel;

    @Column(name = "telefone")
    private int telefone;

    public String getNomehotel() {
        return nomehotel;
    }

    public void setNomehotel(String nomehotel) {
        this.nomehotel = nomehotel;
    }

    public String getEndhotel() {
        return endhotel;
    }

    public void setEndhotel(String endhotel) {
        this.endhotel = endhotel;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}