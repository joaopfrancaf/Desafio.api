package com.example.desafio.Converter;


import com.example.desafio.DTO.ParticipanteDTO;
import com.example.desafio.DTO.PautaDTO;
import com.example.desafio.DTO.PautaParticipanteDTO;
import com.example.desafio.entity.Participante;
import com.example.desafio.entity.Pauta;
import com.example.desafio.entity.PautaParticipante;

public class Converter {

    public static Pauta converterToEntity(PautaDTO pautaDto) {

        Pauta pauta = new Pauta();

        pauta.setName(pautaDto.getName());

        return pauta;
    }
    
  
    public static Participante converterToEntity(ParticipanteDTO participanteDto) {

        Participante participante = new Participante();

        participante.setName(participanteDto.getName());

        return participante;
    }

    public static PautaParticipante converterToEntity(PautaParticipanteDTO pautaParticipanteDto,
                                                              Pauta pauta,
															  Participante participante) {

        PautaParticipante pautaparticipante = new PautaParticipante();

		pautaparticipante.setParticipanteEntities(participante);
		pautaparticipante.setPautaEntities(pauta);
		pautaparticipante.setVoto(pautaParticipanteDto.getVoto());

        return pautaparticipante;

    }
}
