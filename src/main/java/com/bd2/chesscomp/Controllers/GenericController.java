package com.bd2.chesscomp.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bd2.chesscomp.Models.Participante;
import com.bd2.chesscomp.Models.Hotel;
import com.bd2.chesscomp.Models.Jogador;
import com.bd2.chesscomp.Models.Jogo;
import com.bd2.chesscomp.Models.Schedule;
import com.bd2.chesscomp.Repository.HotelRepository;
import com.bd2.chesscomp.Repository.JogoRepository;
import com.bd2.chesscomp.Repository.ParticipanteRepository;
import java.time.*;

@RestController
public class GenericController {

    @Autowired
    JogoRepository jogoRepository;
    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping("/")
    public String home() {
        return "home"; // logical view name
    }

    @GetMapping("/getSchedule")
    public @ResponseBody List<Schedule> getSchedule() {
        // @TODO: Pegar todos a programação de jogos e retornar para o front
        // 1. Pega todos os jogos
        // 2. Listamos pra cada jogo: Árbitro, Jogadores, Hotel, Salão e Horário

        List<Jogador> jogadores = new ArrayList<Jogador>();

        List<Jogo> jogos = jogoRepository.findAll();

        ArrayList<Schedule> schedules = new ArrayList<Schedule>();

        for (Jogo jogo : jogos) {
            Schedule schedule = new Schedule();

            schedule.setJogo(jogo.getIdJogo());
            String date = jogo.getDiaJorn() + "/" + jogo.getMesJorn() + "/" + jogo.getAnoJorn();
            schedule.setData(date);

            schedule.setHotel(jogo.getSalao().getHotel().getNomehotel());

            schedule.setArbitro(jogo.getArbitro().getNomeAssoc());
            schedules.add(schedule);
        }

        return schedules;
    }

    @GetMapping("/getGamesByHotel")
    public ResponseEntity<Jogo> getGamesByHotel(@RequestBody Hotel hotel) {
        return new ResponseEntity<Jogo>(null);
    }

    @GetMapping("/getGamesByPlayer")
    public ResponseEntity<Jogo> getGamesByPlayer(@RequestBody Jogador jogador) {
        return new ResponseEntity<Jogo>(null);
    }

    @GetMapping("/getGamesByReferee")
    public ResponseEntity<Jogo> getGamesByReferee(@RequestBody Participante participante) {
        return new ResponseEntity<Jogo>(null);
    }
}
