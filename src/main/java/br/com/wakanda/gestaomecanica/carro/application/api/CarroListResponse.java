package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.List;
import java.util.UUID;

import br.com.wakanda.gestaomecanica.carro.domain.Carro;

public class CarroListResponse {
	private UUID idCarro;
	private String placa;
	private String marca;
	private String modelo;
	
	public static List<CarroListResponse> converte(List<Carro> carros) {
		return null;
	}
}
