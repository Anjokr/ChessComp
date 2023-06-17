package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "jogador")
public class Jogador {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enumassoc", referencedColumnName = "numassoc")
    private Participante enumassoc;

    public Participante getEnumassoc() {
        return enumassoc;
    }

    public void setEnumassoc(Participante enumassoc) {
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