package edu.fiap.tcd.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.tcd.configuracao.ServicosConfig;
import edu.fiap.tcd.controller.dto.FilmeDTO;
import edu.fiap.tcd.modelo.Filme;
import edu.fiap.tcd.repository.FilmeRepository;


@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository filmeRepository;

	@Autowired
	private ServicosConfig config;

	
	private void randomlyRunLong() {
		Random rand = new Random();
		int randomNum = rand.nextInt(3 - 1 + 1) + 1;
		if (randomNum == 3) {
			sleep();
		}
	}

	private void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



/*

	public Page<TopicoDto> lista(@RequestParam(required = false) String nomeCurso, 
			@PageableDefault(sort = "dataCriacao", direction = Direction.DESC, page = 0, size = 10) Pageable paginacao) {
		
		if (nomeCurso == null) {
			Page<Topico> topicos = topicoRepository.findAll(paginacao);
			return TopicoDto.converter(topicos);
		} else {
			Page<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso, paginacao);
			return TopicoDto.converter(topicos);
		}
	}


*/