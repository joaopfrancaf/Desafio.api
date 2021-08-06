package com.example.desafio.service;

import com.example.desafio.entities.ParticipanteEntities;
import com.example.desafio.entities.PautaEntities;
import com.example.desafio.repository.ParticipanteRepository;
import com.example.desafio.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.dtos.PautaParticipanteDto;
import com.example.desafio.entities.PautaParticipanteEntities;
import com.example.desafio.estaticos.Converter;
import com.example.desafio.repository.PautaParticipanteRepository;

import java.util.Optional;

@Component
public class PautaParticipanteSaveService {

	@Autowired
	private ParticipanteRepository participanteRepository;

	@Autowired
	private PautaRepository pautaRepository;

	@Autowired
	private PautaParticipanteRepository pautaParticipanteRepository;
	
	public PautaParticipanteDto pautaParticipanteSave (PautaParticipanteDto pautaParticipanteDto) {
		
		PautaEntities pauta = pautaRepository.getById(pautaParticipanteDto.getIdPauta());
		ParticipanteEntities participante = participanteRepository.getById(pautaParticipanteDto.getIdParticipante());

		PautaParticipanteEntities pp = Converter.converterToEntity(pautaParticipanteDto, pauta, participante);

		pautaParticipanteRepository.save(pp);
		
		return null;
	}
	
	
	
}
