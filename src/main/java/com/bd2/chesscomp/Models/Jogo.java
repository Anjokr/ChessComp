package com.bd2.chesscomp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "jogo")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjogo")
    private int idjogo;

    @ManyToOne
    @JoinColumn(name = "enumarbitro")
    private Participante arbitro;

    @ManyToOne
    @JoinColumn(name = "eidsalao")
    private Salao salao;

    @Column(name = "entrvend")
    private int entrvend;

    @Column(name = "diajorn")
    private int diajorn;

    @Column(name = "mesjorn")
    private int mesjorn;

    @Column(name = "anojorn")
    private int anoJorn;

    // Getters and setters
    public int getIdJogo() {
        return idjogo;
    }

    public void setIdJogo(int idJogo) {
        this.idjogo = idJogo;
    }

    public Participante getArbitro() {
        return arbitro;
    }

    public void setArbitro(Participante arbitro) {
        this.arbitro = arbitro;
    }

    public Salao getSalao() {
        return salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
    }

    public int getEntrVend() {
        return entrvend;
    }

    public void setEntrVend(int entrVend) {
        this.entrvend = entrVend;
    }

    public int getDiaJorn() {
        return diajorn;
    }

    public void setDiaJorn(int diaJorn) {
        this.diajorn = diaJorn;
    }

    public int getMesJorn() {
        return mesjorn;
    }

    public void setMesJorn(int mesJorn) {
        this.mesjorn = mesJorn;
    }

    public int getAnoJorn() {
        return anoJorn;
    }

    public void setAnoJorn(int anoJorn) {
        this.anoJorn = anoJorn;
    }
}
