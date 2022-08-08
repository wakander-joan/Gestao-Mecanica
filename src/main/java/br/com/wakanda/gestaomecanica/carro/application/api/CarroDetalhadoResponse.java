package br.com.wakanda.gestaomecanica.carro.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.wakanda.gestaomecanica.carro.domain.Carro;
import lombok.Value;

@Value
public class CarroDetalhadoResponse {
	
	private UUID idCarro;
	private String placa;
	private String marca;
	private String modelo;
	private LocalDateTime dataHoraDoCadastro;
	private Boolean eletronico;
	
	public CarroDetalhadoResponse(Carro carro) {
		this.idCarro = carro.getIdCarro();
		this.placa = carro.getPlaca();
		this.marca = carro.getMarca();
		this.modelo = carro.getModelo();
		this.dataHoraDoCadastro = carro.getDataHoraDoCadastro();
		this.eletronico = carro.getEletronico();
	}
}
