package br.com.wakanda.gestaomecanica.carro.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.wakanda.gestaomecanica.carro.application.service.CarroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CarroController implements CarroAPI {
	private final CarroService carroService;

	@Override
	public CarroResponse postCarro(CarroRequest carroRequest) {
		//2º Test!
		log.info("[inicia] CarroController - postCarro");
		CarroResponse carroCriado =  carroService.criaCarro(carroRequest);
		log.info("[finaliza] CarroController - postCarro");
		return carroCriado;
	}

}
