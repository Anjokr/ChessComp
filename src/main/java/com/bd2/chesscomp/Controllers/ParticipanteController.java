package com.bd2.chesscomp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bd2.chesscomp.Models.Participante;
import com.bd2.chesscomp.Repository.ParticipanteRepository;

@RestController
public class ParticipanteController {

    @Autowired
    ParticipanteRepository participanteRepository;

    @PostMapping("/addParticipante")
    public void addParticipante(@RequestBody Participante participante) {
        participanteRepository.save(participante);
    }
}
