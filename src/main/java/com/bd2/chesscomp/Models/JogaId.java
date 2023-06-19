package com.bd2.chesscomp.Models;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class JogaId implements Serializable {
    private Integer jogo;
    private Integer jogador;

    public JogaId() {
    }

    public JogaId(Integer jogo, Integer jogador) {
        this.jogo = jogo;
        this.jogador = jogador;
    }

    // Getters e setters

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
}
