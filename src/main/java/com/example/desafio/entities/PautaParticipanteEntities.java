package com.example.desafio.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="pauta_participante")
public class PautaParticipanteEntities implements Serializable {

	private static final long serialVersionUID = 6636567677688099589L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "ID_PAUTA", referencedColumnName = "id")
	private PautaEntities pautaEntities;
	
	@ManyToOne
    @JoinColumn(name = "ID_PARTICIPANTE", referencedColumnName = "id")
	private ParticipanteEntities participanteEntities;
	
	private String voto;
}
