package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, String> {

    @Query("SELECT p FROM Pais p WHERE p.numPais = :numPais")
    Pais findBynumPais(@Param("numPais") Integer numPais);
}