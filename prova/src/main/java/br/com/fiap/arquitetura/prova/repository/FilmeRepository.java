package edu.fiap.tcd.repository;

import org.springframework.data.repository.CrudRepository;

import edu.fiap.tcd.modelo.Filme;

public interface FilmeRepository  extends CrudRepository<Filme, String>{

}
