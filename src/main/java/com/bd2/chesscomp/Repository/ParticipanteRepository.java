package com.bd2.chesscomp.Repository;

import com.bd2.chesscomp.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {

}