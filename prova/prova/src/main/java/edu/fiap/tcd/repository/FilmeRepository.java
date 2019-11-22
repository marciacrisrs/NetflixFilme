package edu.fiap.tcd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fiap.tcd.modelo.Filme;

public interface FilmeRepository  extends JpaRepository<Filme, Long>{


}
