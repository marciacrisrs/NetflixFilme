package edu.fiap.tcd.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.tcd.repository.FilmeRepository;



@Service
public class FilmeService {
	
	

	//@Autowired
	//private ServicosConfig config;

	
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
