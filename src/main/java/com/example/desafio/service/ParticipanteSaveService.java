package com.example.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.Converter.Converter;
import com.example.desafio.DTO.ParticipanteDTO;
import com.example.desafio.entity.Participante;
import com.example.desafio.repository.ParticipanteRepository;

@Component
public class ParticipanteSaveService {

	@Autowired
	private ParticipanteRepository participanteRepository;
	
	public ParticipanteDTO saveParticipante (ParticipanteDTO participanteDto) {
		
		Participante participante = new Participante();
		
		participante = Converter.converterToEntity(participanteDto);
		
		participanteRepository.save(participante);
		
		return participanteDto;
		
	}
}
