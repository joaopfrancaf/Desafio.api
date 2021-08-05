package com.example.desafio.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="pauta")
public class PautaEntities {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;

	 
}

/*@OneToOne(cascade=CascadeType.ALL)
@JoinTable(name="pauta_participante",
joinColumns={@JoinColumn(name="pauta_id", referencedColumnName="id")},
inverseJoinColumns={@JoinColumn(name="participante_id", referencedColumnName="id")})
private ParticipanteEntities participante;*/