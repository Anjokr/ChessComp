package com.bd2.chesscomp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bd2.chesscomp.Models.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {

    @Query("SELECT p.nomeassoc FROM Participante p WHERE p.numassoc = :enumJogador")
    String findNomeAssocByEnumJogador(@Param("enumJogador") Integer enumJogador);

    @Query("SELECT p.numassoc FROM Participante p WHERE p.nomeassoc = :nomeAssoc")
    Integer findEnumParticipanteByNomeAssoc(@Param("nomeAssoc") String nomeAssoc);

    @Query("SELECT p.ecodpais, COUNT(p) FROM Participante p GROUP BY p.ecodpais")
    List<Object[]> getPlayersByCountry();
}