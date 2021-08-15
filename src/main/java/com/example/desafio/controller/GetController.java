package com.example.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.entity.Pauta;
import com.example.desafio.service.PautaGetService;

@RestController
public class GetController {

	@Autowired
	private PautaGetService getService;
	
	@GetMapping("/getall")
	public List<Pauta> pautaGet () {
		return getService.pautaGetAll();
	}
}
