package com.bd2.chesscomp.Models;

public class Schedule {
    // Jogo
    private int jogo;

    // Data
    private String data;

    // Hotel
    private String hotel;

    private String arbitro;

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    // Getters e Setters
    public int getJogo() {
        return this.jogo;
    }

    public void setJogo(int jogoNew) {
        this.jogo = jogoNew;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String dataNew) {
        this.data = dataNew;
    }

    public String getHotel() {
        return this.hotel;
    }

    public void setHotel(String hotelNew) {
        this.hotel = hotelNew;
    }
}