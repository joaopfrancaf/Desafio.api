package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.entities.PautaEntities;

public interface PautaRepository extends JpaRepository<PautaEntities, Long> {

}
