package br.com.wakanda.gestaomecanica.carro.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CarroController implements CarroAPI {

	@Override
	public CarroResponse postCarro(CarroRequest carroRequest) {
		//2º Test!
		log.info("[inicia] CarroController - postCarro");
		log.info("[finaliza] CarroController - postCarro");
		return null;
	}

}
