package edu.fiap.tcd.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import edu.fiap.tcd.modelo.Filme;
import edu.fiap.tcd.repository.FilmeRepository;

public class AtualizacaoFilmeForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	private String nome;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String nomeGenero;


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}


	public Filme atualizar(Long id, FilmeRepository filmeRepository) {
		Filme filme = filmeRepository.getOne(id);
		
		filme.setNome(this.nome);
		
		return filme;
	}
	
}


