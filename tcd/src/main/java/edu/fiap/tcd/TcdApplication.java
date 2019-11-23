package edu.fiap.tcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="edu.fiap.tcd")
public class TcdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcdApplication.class, args);
	}

}
