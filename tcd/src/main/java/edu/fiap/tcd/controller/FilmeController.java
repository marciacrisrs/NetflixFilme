package edu.fiap.tcd.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.base.Optional;

import edu.fiap.tcd.controller.dto.FilmeDTO;
import edu.fiap.tcd.form.AtualizacaoFilmeForm;
import edu.fiap.tcd.form.FilmeForm;
import edu.fiap.tcd.modelo.Filme;
import edu.fiap.tcd.repository.FilmeRepository;
import edu.fiap.tcd.repository.GeneroRepository;


@Controller
public class FilmeController {
	
	@Autowired
	FilmeRepository filmeRepository;
	
	
	@Autowired
	private GeneroRepository generoRepository;

	
	@GetMapping
	public List<Filme> lista() {
			List<Filme> filmes = filmeRepository.findAll();
			return filmes;
	}
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDeFilme", allEntries = true)
	public ResponseEntity<FilmeDTO> cadastrar(@RequestBody @Valid FilmeForm form, UriComponentsBuilder uriBuilder) {
		Filme filme = form.converter(generoRepository);
		filmeRepository.save(filme);
		
		URI uri = uriBuilder.path("/filme/{id}").buildAndExpand(filme.getId()).toUri();
		return ResponseEntity.created(uri).body(new FilmeDTO(filme));
	}
	
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeTopicos", allEntries = true)
	public ResponseEntity<FilmeDTO> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoFilmeForm form) {
		java.util.Optional<Filme> optional = filmeRepository.findById(id);
		if (optional.isPresent()) {
			Filme filme = form.atualizar(id, filmeRepository);
			return ResponseEntity.ok(new FilmeDTO(filme));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeTopicos", allEntries = true)
	public ResponseEntity<?> remover(@PathVariable Long id) {
		java.util.Optional<Filme> optional = filmeRepository.findById(id);
		if (optional.isPresent()) {
			filmeRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}

	
	
	
}
