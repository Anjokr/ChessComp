package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "meiosalao")
public class MeioSalao {
    @Id
    private int eidsalao;

    public int getEidsalao() {
        return eidsalao;
    }

    public void setEidsalao(int eidsalao) {
        this.eidsalao = eidsalao;
    }

    @Column(name = "meio")
    private String meio;

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }
}