package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "jogador")
public class Jogador {
    @Id
    @Column (name = "enumassoc")
    private int enumassoc;

    public int getEnumassoc() {
        return enumassoc;
    }

    public void setEnumassoc(int enumassoc) {
        this.enumassoc = enumassoc;
    }

    @Column(name = "nivel")
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}