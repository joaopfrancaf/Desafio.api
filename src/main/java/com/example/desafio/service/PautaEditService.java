package com.example.desafio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.DTO.UpdatePautaDTO;
import com.example.desafio.entity.Pauta;
import com.example.desafio.repository.PautaRepository;

@Component
public class PautaEditService {

	@Autowired
	private PautaRepository pautaRepository;
	
	
	
	public UpdatePautaDTO editPauta (UpdatePautaDTO updatePautaDTO) {
		
		Optional<Pauta> pautaOp  = pautaRepository.findById(updatePautaDTO.getId());
		
		Pauta pauta = pautaOp.get();
		
		pauta.setName(updatePautaDTO.getName());
		
		pautaRepository.save(pauta);
		
		return null;
		
	}
}
