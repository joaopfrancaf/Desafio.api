package com.example.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.dtos.ParticipanteDto;
import com.example.desafio.dtos.PautaDto;
import com.example.desafio.dtos.PautaParticipanteDto;
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
	 public PautaDto savePauta(@RequestBody PautaDto pautaDto) {		
		//PautaSaveService pautaSaveService = new PautaSaveService(); //precisa colocar como atributo da classe com o @Autowired para funcionar na web
		
		return pautaSaveService.savePauta(pautaDto);
	  }
	 
	@PostMapping("/participanteadd")
	 public ParticipanteDto saveParticipante(@RequestBody ParticipanteDto participanteDto) {
		//ParticipanteSaveService participanteSaveService = new ParticipanteSaveService();
		
		return participanteSaveService.saveParticipante(participanteDto);
	  }
	
	@PostMapping("/pautaparticipanteadd")
	 public PautaParticipanteDto savePautaParticipante(@RequestBody PautaParticipanteDto pautaParticipanteDto) {
		//PautaParticipanteSaveService pautaParticipanteSaveService = new PautaParticipanteSaveService();
		
		return pautaParticipanteSaveService.pautaParticipanteSave(pautaParticipanteDto);
	  }
    
}