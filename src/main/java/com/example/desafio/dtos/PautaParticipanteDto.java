package com.example.desafio.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PautaParticipanteDto {

	private String voto;
	private Long idPauta;
	private Long idParticipante;
	
}
