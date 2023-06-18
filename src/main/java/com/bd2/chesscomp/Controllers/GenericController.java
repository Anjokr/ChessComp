package com.bd2.chesscomp.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import com.bd2.chesscomp.Models.Joga;
import com.bd2.chesscomp.Models.Jogo;
import com.bd2.chesscomp.Models.Schedule;
import com.bd2.chesscomp.Repository.HotelRepository;
import com.bd2.chesscomp.Repository.JogaRepository;
import com.bd2.chesscomp.Repository.JogoRepository;
import com.bd2.chesscomp.Repository.ParticipanteRepository;

@RestController
public class GenericController {

    @Autowired
    JogoRepository jogoRepository;
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    JogaRepository jogaRepository;
    @Autowired
    ParticipanteRepository participanteRepository;

    @RequestMapping("/")
    public String home() {
        return "home"; // logical view name
    }

    @GetMapping("/getSchedule")
    public @ResponseBody List<Schedule> getSchedule() {
        List<Jogo> jogos = jogoRepository.findAll();

        ArrayList<Schedule> schedules = new ArrayList<Schedule>();

        for (Jogo jogo : jogos) {
            Schedule schedule = new Schedule();

            schedule.setJogo(jogo.getIdJogo());
            String date = jogo.getDiaJorn() + "/" + jogo.getMesJorn() + "/" + jogo.getAnoJorn();
            schedule.setData(date);

            schedule.setHotel(jogo.getSalao().getHotel().getNomehotel());

            schedule.setArbitro(jogo.getArbitro().getNomeAssoc());

            List<Joga> joga = jogaRepository.findAllByJogoId(jogo.getIdJogo());

            String nomeJogador1 = participanteRepository.findNomeAssocByEnumJogador(joga.get(0).getJogador());
            String nomeJogador2 = participanteRepository.findNomeAssocByEnumJogador(joga.get(0).getJogador());

            schedule.setJogador1(nomeJogador1);
            schedule.setJogador2(nomeJogador2);

            schedules.add(schedule);
        }

        return schedules;
    }

    @PostMapping("/getGamesByHotel")
    public @ResponseBody List<Jogo> getGamesByHotel(@RequestParam("username") String nomeHotel) {

        List<Jogo> jogos = hotelRepository.findJogosByHotel(nomeHotel);

        return jogos;
    }

    @PostMapping("/getGamesByPlayer")
    public @ResponseBody List<Jogo> getGamesByPlayer(@RequestParam String nomejogador) {
        int numassoc = participanteRepository.findEnumParticipanteByNomeAssoc(nomejogador);

        List<Jogo> jogos = jogoRepository.findJogosByJogador(numassoc);

        return jogos;
    }

    @PostMapping("/getGamesByReferee")
    public @ResponseBody List<Jogo> getGamesByReferee(@RequestParam String nomearbitro) {
        int numassoc = participanteRepository.findEnumParticipanteByNomeAssoc(nomearbitro);

        List<Jogo> jogos = jogoRepository.findJogosByArbitro(numassoc);

        return jogos;
    }
}
