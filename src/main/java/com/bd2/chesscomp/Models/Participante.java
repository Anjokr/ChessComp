package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "participante")
public class Participante {

    public Participante() {

    }

    @Id
    private int numassoc;

    public int getNumAssoc() {
        return numassoc;
    }

    public void setNumAssoc(int numassoc) {
        this.numassoc = numassoc;
    }

    @Column(name = "nomeassoc")
    private String nomeassoc;

    public String getNomeAssoc() {
        return nomeassoc;
    }

    public void setNomeAssoc(String nomeAssoc) {
        nomeassoc = nomeAssoc;
    }

    @Column(name = "endereco")
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String end) {
        endereco = end;
    }

    @Column(name = "telcontat")
    private String telcontat;

    public String getTelcontat() {
        return telcontat;
    }

    public void setTelcontat(String telContat) {
        telcontat = telContat;
    }

    @Column(name = "ecodpais")
    private int ecodpais;

    public int getEcodpais() {
        return ecodpais;
    }

    public void setEcodpais(int eCodPais) {
        ecodpais = eCodPais;
    }

    @Column(name = "tipopar")
    private String tipopar;

    public String getTipopar() {
        return tipopar;
    }

    public void setTipopar(String tipoPar) {
        tipopar = tipoPar;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "numAssoc=" + numassoc +
                ", nomeAssoc='" + nomeassoc + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telContat='" + telcontat + '\'' +
                ", ecodPais=" + ecodpais +
                ", tipoPar='" + tipopar + '\'' +
                '}';
    }
}