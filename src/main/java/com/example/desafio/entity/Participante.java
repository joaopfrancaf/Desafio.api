package com.example.desafio.entity;


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

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="participante")
public class Participante implements Serializable {

	private static final long serialVersionUID = 6136567631688339586L;

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