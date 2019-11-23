package edu.fiap.tcd.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fiap.tcd.modelo.*;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
	Page<Filme> findByNomeGenero(String nomegenero, Pageable paginacao);



}
