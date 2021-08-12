package com.example.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.Converter.Converter;
import com.example.desafio.DTO.PautaDTO;
import com.example.desafio.entity.Pauta;
import com.example.desafio.repository.PautaRepository;

@Component
public class PautaSaveService {
	
	@Autowired
	private PautaRepository pautarepository;
	
	public PautaDTO savePauta (PautaDTO pautaDto) {
		
		Pauta pauta = new Pauta();
		
		pauta = Converter.converterToEntity(pautaDto);
		
		pautarepository.save(pauta);
		
		return pautaDto;
		
	}
}
