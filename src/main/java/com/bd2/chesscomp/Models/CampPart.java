package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "camppart")
public class CampPart {
    @Id
    @Column(name = "enumassoc")
    private int enumassoc;

    @Column(name = "nomecamp")
    private String nomecamp;

    @Column(name = "tipopartida")
    private String tipopartida;

    @ManyToOne
    @JoinColumn(name = "enumassoc", referencedColumnName = "numassoc", insertable = false, updatable = false)
    private Participante participante;

    // Getters and setters
    public int getNumAssoc() {
        return enumassoc;
    }

    public void setNumAssoc(int numAssoc) {
        this.enumassoc = numAssoc;
    }

    public String getNomeCamp() {
        return nomecamp;
    }

    public void setNomeCamp(String nomeCamp) {
        this.nomecamp = nomeCamp;
    }

    public String getTipoPartida() {
        return tipopartida;
    }

    public void setTipoPartida(String tipopartida) {
        this.tipopartida = tipopartida;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
}