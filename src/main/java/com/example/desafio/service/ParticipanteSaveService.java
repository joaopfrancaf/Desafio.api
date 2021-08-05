package com.example.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.dtos.ParticipanteDto;
import com.example.desafio.entities.ParticipanteEntities;
import com.example.desafio.estaticos.Converter;
import com.example.desafio.repository.ParticipanteRepository;

@Component
public class ParticipanteSaveService {

	@Autowired
	private ParticipanteRepository participanteRepository;
	
	public ParticipanteDto saveParticipante (ParticipanteDto participanteDto) {
		
		ParticipanteEntities participante = new ParticipanteEntities();
		
		participante = Converter.converterToEntity(participanteDto);
		
		participanteRepository.save(participante);
		
		return participanteDto;
		
	}
}
