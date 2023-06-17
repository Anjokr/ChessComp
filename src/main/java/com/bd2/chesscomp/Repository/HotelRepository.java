package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    // @Query(value = "SELECT enomehotel FROM salao WHERE idsalao = :#{#id}")
    // String getHotelFromSalao(@Param("id") int id);

    Hotel findById(int id);

}