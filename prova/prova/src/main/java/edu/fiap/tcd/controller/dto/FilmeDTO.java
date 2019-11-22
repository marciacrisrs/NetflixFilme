package edu.fiap.tcd.controller.dto;


import org.springframework.data.domain.Page;

import edu.fiap.tcd.modelo.Filme;

public class FilmeDTO {
	
	private Long id;
	private String nome;
	private String detalhe;
	
	
	
	public FilmeDTO(Filme filme) {
		super();
		this.id = filme.getId();
		this.nome = filme.getNome();
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public String getDetalhe() {
		return detalhe;
	}

	
	public static Page<FilmeDTO> converter(Page<Filme> filmes) {
		return filmes.map(FilmeDTO::new);
	}

	

}
