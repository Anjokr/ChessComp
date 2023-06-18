package com.bd2.chesscomp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bd2.chesscomp.Repository.JogoRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JogoController {

    private final JogoRepository jogoRepository;

    @Autowired
    public JogoController(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    @GetMapping("/curva-movimentoXjogo")
    public String gerarCurva(Model model) {
        List<Object[]> result = jogoRepository.getGamesData();
        List<Integer> gameIds = new ArrayList<>();
        List<Long> numMoves = new ArrayList<>();

        for (Object[] row : result) {
            gameIds.add((Integer) row[0]);
            numMoves.add((Long) row[1]);
        }

        model.addAttribute("gameIds", gameIds);
        model.addAttribute("numMoves", numMoves);

        return "games-charts";
    }
}
