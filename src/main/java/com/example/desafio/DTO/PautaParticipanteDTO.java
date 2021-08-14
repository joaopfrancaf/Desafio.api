package com.example.desafio.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PautaParticipanteDTO {

	private String voto;
	private Long idPauta;
	private Long idParticipante;
	
}
