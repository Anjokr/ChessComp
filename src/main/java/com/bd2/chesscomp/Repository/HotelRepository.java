package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

    @Query("SELECT j FROM Jogo j WHERE j.salao.hotel.nomehotel = :nomeHotel")
    List<Jogo> findJogosByHotel(@Param("nomeHotel") String nomeHotel);

    Hotel findBynomehotel(String nomehotel);
}