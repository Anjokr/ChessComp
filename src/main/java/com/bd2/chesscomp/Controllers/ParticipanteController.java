package com.bd2.chesscomp.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bd2.chesscomp.Repository.PaisRepository;
import com.bd2.chesscomp.Repository.ParticipanteRepository;

@Controller
public class ParticipanteController {

    private final ParticipanteRepository participanteRepository;
    private final PaisRepository paisRepository;

    public ParticipanteController(ParticipanteRepository participanteRepository, PaisRepository paisRepository) {
        this.participanteRepository = participanteRepository;
        this.paisRepository = paisRepository;
    }

    @GetMapping("/jogadores-por-pais")
    public String gerarCurvaPais(Model model) {
        List<Object[]> playerData = participanteRepository.getPlayersByCountry();

        // Extrair os dados de país e número de jogadores
        List<String> countries = new ArrayList<>();
        List<Long> playerCounts = new ArrayList<>();

        for (Object[] data : playerData) {
            Integer countryId = (Integer) data[0];
            String countryName = paisRepository.findBynumPais(countryId).getNome();
            Long playerCount = (Long) data[1];

            countries.add(countryName);
            playerCounts.add(playerCount);
        }

        model.addAttribute("countries", countries);
        model.addAttribute("playerCounts", playerCounts);

        return "player-chart";
    }
}
