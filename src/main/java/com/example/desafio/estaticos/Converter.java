package com.example.desafio.estaticos;

import com.example.desafio.dtos.ParticipanteDto;
import com.example.desafio.dtos.PautaDto;
import com.example.desafio.dtos.PautaParticipanteDto;
import com.example.desafio.entities.ParticipanteEntities;
import com.example.desafio.entities.PautaEntities;
import com.example.desafio.entities.PautaParticipanteEntities;

public class Converter {

	public static PautaEntities converterToEntity (PautaDto pautaDto) {
		
		PautaEntities pauta = new PautaEntities();
		
		pauta.setName(pautaDto.getName());
		
		return pauta;
	}
	
	public static ParticipanteEntities converterToEntity (ParticipanteDto participanteDto) {
		
		ParticipanteEntities participante = new ParticipanteEntities();
		
		participante.setName(participanteDto.getName());
		
		return participante;
	}
	
	public static PautaParticipanteEntities converterToEntity (PautaParticipanteDto pautaParticipanteDto) {
		
		PautaParticipanteEntities pautaparticipante = new PautaParticipanteEntities();
		
		pautaparticipante.setVoto(pautaParticipanteDto.getVoto());
		pautaparticipante.setIdParticipante(pautaParticipanteDto.getIdParticipante());
		pautaparticipante.setIdPauta(pautaParticipanteDto.getIdPauta());
		
		return pautaparticipante;
		
	}
}
