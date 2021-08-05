package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.entities.ParticipanteEntities;

public interface ParticipanteRepository extends JpaRepository<ParticipanteEntities, Long> {

}
