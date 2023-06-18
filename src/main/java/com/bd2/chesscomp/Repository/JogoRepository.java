package com.bd2.chesscomp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.bd2.chesscomp.Models.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {

    @Query("SELECT j FROM Jogo j JOIN Joga jo ON jo.jogador = :numassoc")
    List<Jogo> findJogosByJogador(@Param("numassoc") Integer numassoc);

    @Query("SELECT j FROM Jogo j WHERE j.arbitro.numassoc = :numassoc")
    List<Jogo> findJogosByArbitro(@Param("numassoc") Integer numassoc);
}