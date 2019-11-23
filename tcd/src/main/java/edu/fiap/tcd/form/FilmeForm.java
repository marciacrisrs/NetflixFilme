package edu.fiap.tcd.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import edu.fiap.tcd.modelo.Filme;
import edu.fiap.tcd.modelo.Genero;
import edu.fiap.tcd.repository.GeneroRepository;

public class FilmeForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	private String nome;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String nomeGenero;
	

	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}


	public Filme converter(GeneroRepository generoRepository) {
		Genero genero = generoRepository.findByNome(nomeGenero);
		return new Filme(nome, genero);
	}



}


