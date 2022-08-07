package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/carro")
public interface CarroAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	CarroResponse postCarro(@Valid @RequestBody CarroRequest carroRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List <CarroListResponse> getTodosCarros ();
}
