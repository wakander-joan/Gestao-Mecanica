package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class CarroListResponse {
	private UUID idCarro;
	private String placa;
	private String marca;
	private String modelo;
}
