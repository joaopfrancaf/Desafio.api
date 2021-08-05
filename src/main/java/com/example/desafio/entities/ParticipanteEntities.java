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
@Table(name="participante")
public class ParticipanteEntities {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
}


/*@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="pauta_participante",
    joinColumns={@JoinColumn(name="participante_id", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="pauta_id", referencedColumnName="id")})
    private List<PautaEntities> pautaList;*/