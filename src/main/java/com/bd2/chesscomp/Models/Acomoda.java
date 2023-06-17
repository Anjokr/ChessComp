package com.bd2.chesscomp.Models;

import java.sql.Date;
import java.time.*;

import jakarta.persistence.*;

@Entity
@Table(name = "acomoda")
public class Acomoda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idacomoda")
    private int idAcomoda;

    @ManyToOne
    @JoinColumn(name = "enomehotel")
    private Hotel enomehotel;

    @Column(name = "enumassoc")
    private Participante enumassoc;

    @Column(name = "dataentrada")
    private LocalDate dataentrada;

    @Column(name = "DataSaida")
    private LocalDate datasaida;

    public Hotel getEnomehotel() {
        return enomehotel;
    }

    public void setEnomehotel(Hotel enomehotel) {
        this.enomehotel = enomehotel;
    }

    public Participante getEnumassoc() {
        return enumassoc;
    }

    public void setEnumassoc(Participante enumassoc) {
        this.enumassoc = enumassoc;
    }

    public LocalDate getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(LocalDate dataentrada) {
        this.dataentrada = dataentrada;
    }

    public LocalDate getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(LocalDate datasaida) {
        this.datasaida = datasaida;
    }
}