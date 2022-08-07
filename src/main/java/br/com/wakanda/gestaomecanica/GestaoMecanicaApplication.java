package br.com.wakanda.gestaomecanica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoMecanicaApplication {
	
	@GetMapping
	public String getHomeTeste() {
		 
		return "<h1>Primeiro passo bem sucedido Joan!</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestaoMecanicaApplication.class, args);
	}

}
