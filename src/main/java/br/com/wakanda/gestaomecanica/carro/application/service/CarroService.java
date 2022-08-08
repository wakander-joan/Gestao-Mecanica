package br.com.wakanda.gestaomecanica.carro.application.service;

import java.util.List;

import br.com.wakanda.gestaomecanica.carro.application.api.CarroDetalhadoResponse;
import br.com.wakanda.gestaomecanica.carro.application.api.CarroListResponse;
import br.com.wakanda.gestaomecanica.carro.application.api.CarroRequest;
import br.com.wakanda.gestaomecanica.carro.application.api.CarroResponse;

public interface CarroService {
	CarroResponse criaCarro(CarroRequest carroRequest);
	List<CarroListResponse> buscaTodosCarros();
	CarroDetalhadoResponse buscaCarroPorPlaca(String placa);
}
