package br.com.wakanda.gestaomecanica.carro.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class CarroRequest {
	
	@NotBlank
	private String placa;
	@NotBlank
	private String marca;
	@NotBlank
	private String modelo;
	@NotBlank
	private String motor;
	@NotBlank
	private String ano;
	@NotBlank
	private String cor;
	@NotNull
	private Boolean eletronico;
	
}
