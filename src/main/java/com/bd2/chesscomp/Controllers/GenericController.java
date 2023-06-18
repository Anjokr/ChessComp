package com.bd2.chesscomp.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.bd2.chesscomp.Models.Joga;
import com.bd2.chesscomp.Models.Jogo;
import com.bd2.chesscomp.Models.Schedule;
import com.bd2.chesscomp.Repository.HotelRepository;
import com.bd2.chesscomp.Repository.JogaRepository;
import com.bd2.chesscomp.Repository.JogoRepository;
import com.bd2.chesscomp.Repository.ParticipanteRepository;

@Controller
public class GenericController {

    @Autowired
    JogoRepository jogoRepository;
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    JogaRepository jogaRepository;
    @Autowired
    ParticipanteRepository participanteRepository;

    @GetMapping("/")
    public String home() {
        return "home"; // logical view name
    }

    @GetMapping("/getSchedule")
    public String getSchedule(Model model) {
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

        model.addAttribute("schedules", schedules);

        return "schedule";
    }

    @PostMapping("/getGamesByHotel")
    public String getGamesByHotel(@RequestParam("username") String nomeHotel, Model model) {

        List<Jogo> jogos = hotelRepository.findJogosByHotel(nomeHotel);
        model.addAttribute("jogos", jogos);
        return "listGamesForHotel";
    }

    @PostMapping("/getGamesByPlayer")
    public String getGamesByPlayer(@RequestParam("username") String nomejogador, Model model) {
        int numassoc = participanteRepository.findEnumParticipanteByNomeAssoc(nomejogador);

        List<Jogo> jogos = jogoRepository.findJogosByJogador(numassoc);
        model.addAttribute("jogos", jogos);
        return "listGamesForPlayer";
    }

    @PostMapping("/getGamesByReferee")
    public String getGamesByReferee(@RequestParam("username") String nomearbitro, Model model) {
        int numassoc = participanteRepository.findEnumParticipanteByNomeAssoc(nomearbitro);

        List<Jogo> jogos = jogoRepository.findJogosByArbitro(numassoc);
        model.addAttribute("jogos", jogos);
        return "listGamesForReferee";
    }
}
