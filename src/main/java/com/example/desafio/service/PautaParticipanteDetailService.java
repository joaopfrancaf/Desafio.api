package com.example.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.example.desafio.entity.Pauta;
import com.example.desafio.repository.PautaRepository;

public class PautaParticipanteDetailService {

	@Autowired
	private PautaRepository pautaRepository;

	public List<Pauta> execute(Long id, String nome,int numParticipantes, int numVotos) {

		ExampleMatcher matcher = ExampleMatcher
				.matching()
				.withMatcher("nomePauta", ExampleMatcher.GenericPropertyMatchers.startsWith())
				.withIgnoreCase("nome");

		Example<Pauta> example = Example.of(
				Pauta.builder()
				.id(id)
				.name(nome)
				.build(), matcher);

		return pautaRepository.findAll(example);
	}
}
