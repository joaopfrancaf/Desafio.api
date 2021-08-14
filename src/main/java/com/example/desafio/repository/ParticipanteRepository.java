package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.entity.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

}
