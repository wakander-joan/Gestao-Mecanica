package br.com.wakanda.gestaomecanica.carro.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class CarroDetalhadoResponse {
	private UUID idCarro;
	private String placa;
	private String marca;
	private String modelo;
	private LocalDateTime dataHoraDoCadastro;
	private Boolean eletronico;
}
