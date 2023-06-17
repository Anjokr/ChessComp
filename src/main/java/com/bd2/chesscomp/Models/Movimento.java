package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "movimento")
public class Movimento {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eidjogo")
    private Jogo eidjogo;

    public Jogo getEidjogo() {
        return eidjogo;
    }

    public void setEidjogo(Jogo eidjogo) {
        this.eidjogo = eidjogo;
    }

    @Id
    private int idmovimento;

    public int getIdmovimento() {
        return idmovimento;
    }

    public void setIdmovimento(int idmovimento) {
        this.idmovimento = idmovimento;
    }

    @Column(name = "jogada")
    private int jogada;

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    @Column(name = "comentario")
    private String comentario;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
