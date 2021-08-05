package com.example.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.dtos.PautaDto;
import com.example.desafio.entities.PautaEntities;
import com.example.desafio.estaticos.Converter;
import com.example.desafio.repository.PautaRepository;

@Component
public class PautaSaveService {
	
	@Autowired
	private PautaRepository pautarepository;
	
	public PautaDto savePauta (PautaDto pautaDto) {
		
		PautaEntities pauta = new PautaEntities();
		
		pauta = Converter.converterToEntity(pautaDto);
		
		pautarepository.save(pauta);
		
		return pautaDto;
		
	}
}
