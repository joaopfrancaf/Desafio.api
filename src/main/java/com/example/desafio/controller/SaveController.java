package com.example.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.DTO.ParticipanteDTO;
import com.example.desafio.DTO.PautaDTO;
import com.example.desafio.DTO.PautaParticipanteDTO;
import com.example.desafio.service.ParticipanteSaveService;
import com.example.desafio.service.PautaParticipanteSaveService;
import com.example.desafio.service.PautaSaveService;


@RestController
public class SaveController {
	
	@Autowired 
	private PautaSaveService pautaSaveService;
	@Autowired
	private ParticipanteSaveService participanteSaveService;
	@Autowired
	private PautaParticipanteSaveService pautaParticipanteSaveService;
	
	@PostMapping("/pautaadd")
	 public PautaDTO savePauta(@RequestBody PautaDTO pautaDto) {		
		//PautaSaveService pautaSaveService = new PautaSaveService(); //precisa colocar como atributo da classe com o @Autowired para funcionar na web
		
		return pautaSaveService.savePauta(pautaDto);
	  }
	 
	@PostMapping("/participanteadd")
	 public ParticipanteDTO saveParticipante(@RequestBody ParticipanteDTO participanteDto) {
		//ParticipanteSaveService participanteSaveService = new ParticipanteSaveService();
		
		return participanteSaveService.saveParticipante(participanteDto);
	  }
	
	@PostMapping("/pautaparticipanteadd")
	 public PautaParticipanteDTO savePautaParticipante(@RequestBody PautaParticipanteDTO pautaParticipanteDto) {
		//PautaParticipanteSaveService pautaParticipanteSaveService = new PautaParticipanteSaveService();
		
		return pautaParticipanteSaveService.pautaParticipanteSave(pautaParticipanteDto);
	  }
    
}