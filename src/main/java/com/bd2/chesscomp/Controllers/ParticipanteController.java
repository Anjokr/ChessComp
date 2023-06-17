package com.bd2.chesscomp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bd2.chesscomp.Models.Participante;
import com.bd2.chesscomp.Models.Hotel;
import com.bd2.chesscomp.Models.Jogador;
import com.bd2.chesscomp.Models.Jogo;
import com.bd2.chesscomp.Models.Schedule;
import com.bd2.chesscomp.Repository.ParticipanteRepository;

@RestController
public class ParticipanteController {

    @Autowired
    ParticipanteRepository participanteRepository;

    @PostMapping("/getSchedule")
    public ResponseEntity<Schedule> getSchedule() {
        // @TODO: Pegar todos a programação de jogos e retornar para o front
        return new ResponseEntity<Schedule>(null);
    }

    @PostMapping("/getGames")
    public ResponseEntity<Jogo> getGames(@RequestBody Hotel hotel, Jogador jogador, Participante participante) {
        return new ResponseEntity<Jogo>(null);
    }

}
