package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

    List<Jogo> findAll();

}