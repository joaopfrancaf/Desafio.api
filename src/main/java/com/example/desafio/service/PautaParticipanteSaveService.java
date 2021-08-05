package com.example.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.dtos.PautaParticipanteDto;
import com.example.desafio.entities.PautaParticipanteEntities;
import com.example.desafio.estaticos.Converter;
import com.example.desafio.repository.PautaParticipanteRepository;

@Component
public class PautaParticipanteSaveService {

	@Autowired
	private PautaParticipanteRepository pautaParticipanteRepository;
	
	public PautaParticipanteDto pautaParticipanteSave (PautaParticipanteDto pautaParticipanteDto ) {
		
		PautaParticipanteEntities pp = new PautaParticipanteEntities();
		pp = Converter.converterToEntity(pautaParticipanteDto);
		pautaParticipanteRepository.save(pp);
		
		return null;
	}
	
	
	
}
