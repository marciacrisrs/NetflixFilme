package edu.fiap.tcd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fiap.tcd.modelo.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {

	Genero findByNome(String nome);

}