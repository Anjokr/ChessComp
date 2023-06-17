package com.bd2.chesscomp;

import java.time.*;

import com.bd2.chesscomp.Models.Acomoda;
import com.bd2.chesscomp.Models.Hotel;
import com.bd2.chesscomp.Models.Participante;

public class CreateChampionship {

    public void Create() {

    }

    public void CreateAcomoda(Hotel hotel, Participante participante) {
        Acomoda acomoda = new Acomoda();
        acomoda.setDataentrada(LocalDate.of(2023, 7, 17));
        acomoda.setDatasaida(LocalDate.of(2023, 8, 17));
        acomoda.setEnomehotel(hotel);
        acomoda.setEnumassoc(participante);
    }

}
