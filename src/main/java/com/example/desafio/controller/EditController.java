package com.example.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.DTO.UpdatePautaDTO;
import com.example.desafio.service.PautaEditService;


@RestController
public class EditController {

	@Autowired 
	private PautaEditService pautaEditService;
	
	@PutMapping("/pautaedit")
	 public UpdatePautaDTO editPauta(@RequestBody UpdatePautaDTO upPautaDTO) {		
		return pautaEditService.editPauta(upPautaDTO);
	  }
	 
	
	
	
	
	
}
