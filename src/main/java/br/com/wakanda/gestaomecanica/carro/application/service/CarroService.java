package br.com.wakanda.gestaomecanica.carro.application.service;

import br.com.wakanda.gestaomecanica.carro.application.api.CarroRequest;
import br.com.wakanda.gestaomecanica.carro.application.api.CarroResponse;

public interface CarroService {
	CarroResponse criaCarro(CarroRequest carroRequest);
}
