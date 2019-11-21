package br.com.fiap.arquitetura.prova.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Genero genero;
	private List<Ator> atores;
	private Descricao descricao;
	private Detalhes detalhes;
	private List<Palavra_Chave> listaDePalavras;
	
	

}
