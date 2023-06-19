package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JogaRepository extends JpaRepository<Joga, Integer> {
    @Query("SELECT j FROM Joga j WHERE j.jogoObj.idjogo = :jogoId")
    List<Joga> findAllByJogoId(Integer jogoId);
}