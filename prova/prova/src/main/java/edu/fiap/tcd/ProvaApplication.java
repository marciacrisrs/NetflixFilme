package edu.fiap.tcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
 * @EnableSpringDataWebSupport
 * 
 * @EnableCaching
 */
@ComponentScan(basePackages={"edu.fiap.tcd"})
public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}
