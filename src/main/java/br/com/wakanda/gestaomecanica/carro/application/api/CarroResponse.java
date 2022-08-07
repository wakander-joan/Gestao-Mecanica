package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CarroResponse {
	private UUID idCarro;
	private String placa;
}
