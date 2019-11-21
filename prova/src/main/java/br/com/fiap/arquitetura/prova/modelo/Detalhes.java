package edu.fiap.tcd.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Detalhes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank@NotNull
	private String nomedescricao;
	@OneToOne(mappedBy = "filme")
	private Filme filme;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((nomedescricao == null) ? 0 : nomedescricao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Detalhes other = (Detalhes) obj;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (nomedescricao == null) {
			if (other.nomedescricao != null)
				return false;
		} else if (!nomedescricao.equals(other.nomedescricao))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomedescricao() {
		return nomedescricao;
	}
	public void setNomedescricao(String nomedescricao) {
		this.nomedescricao = nomedescricao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	

}
