package com.example.desafio.service;

import com.example.desafio.repository.ParticipanteRepository;
import com.example.desafio.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.Converter.Converter;
import com.example.desafio.DTO.PautaParticipanteDTO;
import com.example.desafio.entity.Participante;
import com.example.desafio.entity.Pauta;
import com.example.desafio.entity.PautaParticipante;
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
	
	public PautaParticipanteDTO pautaParticipanteSave (PautaParticipanteDTO pautaParticipanteDto) {
		
		Pauta pauta = pautaRepository.getById(pautaParticipanteDto.getIdPauta());
		Participante participante = participanteRepository.getById(pautaParticipanteDto.getIdParticipante());

		PautaParticipante pp = Converter.converterToEntity(pautaParticipanteDto, pauta, participante);

		pautaParticipanteRepository.save(pp);
		
		return null;
	}
	
	
	
}
