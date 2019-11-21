package edu.fiap.tcd.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank@NotNull
	private String nome;
	@OneToMany(mappedBy = "filme")
	private Genero genero;
	@OneToOne(mappedBy = "filme")
	private List<Ator> atores;
	@OneToOne(mappedBy = "filme")
	private Descricao descricao;
	@OneToOne(mappedBy = "filme")
	private Detalhes detalhes;
	@OneToOne(mappedBy = "filme")
	private List<Palavra_Chave> listaDePalavras;
	
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
