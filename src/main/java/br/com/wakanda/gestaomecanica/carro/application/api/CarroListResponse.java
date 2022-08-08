package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.wakanda.gestaomecanica.carro.domain.Carro;
import lombok.Value;

@Value
public class CarroListResponse {
	private UUID idCarro;
	private String placa;
	private String marca;
	private String modelo;
	
	public static List<CarroListResponse> converte(List<Carro> carros) {
		return carros.stream()
				.map(CarroListResponse:: new )
				.collect(Collectors.toList());
	}

	public CarroListResponse(Carro carro) {
		this.idCarro = carro.getIdCarro();
		this.placa = carro.getPlaca();
		this.marca = carro.getMarca();
		this.modelo = carro.getModelo();
	}
}
