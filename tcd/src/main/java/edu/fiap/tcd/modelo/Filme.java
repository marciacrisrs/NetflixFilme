package edu.fiap.tcd.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank@NotNull
	private String nome;
	@ManyToOne
	private Genero genero;
	@OneToMany(mappedBy = "filme")
	private List<Ator> atores =new ArrayList<Ator>();
	@OneToOne
	private Descricao descricao;
	@OneToOne
	private Detalhes detalhes;
	@OneToMany(mappedBy = "filme")
	private List<Palavra_Chave> listaDePalavras;
	
	public Filme() {
		
	}
	
	public Filme( String nome, Genero genero) {

		this.nome = nome;
		this.genero=genero;
	}

	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return this.id;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public List<Ator> getAtores() {
		return atores;
	}
	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	public Descricao getDescricao() {
		return descricao;
	}
	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}
	public Detalhes getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(Detalhes detalhes) {
		this.detalhes = detalhes;
	}
	public List<Palavra_Chave> getListaDePalavras() {
		return listaDePalavras;
	}
	public void setListaDePalavras(List<Palavra_Chave> listaDePalavras) {
		this.listaDePalavras = listaDePalavras;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Filme other = (Filme) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	

}
