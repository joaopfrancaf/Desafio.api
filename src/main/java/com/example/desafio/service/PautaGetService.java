package com.example.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.entity.Pauta;
import com.example.desafio.repository.PautaRepository;

@Component
public class PautaGetService {

	@Autowired
	private PautaRepository pauta;
	
	public List<Pauta> pautaGetAll () {
		
		/*List<Pauta> pautaDTO;
		pautaDTO = pauta.findAll();*/
		
		return pauta.findAll();
		
	}
	
}
