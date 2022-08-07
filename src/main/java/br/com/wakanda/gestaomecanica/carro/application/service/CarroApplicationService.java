package br.com.wakanda.gestaomecanica.carro.application.service;

import org.springframework.stereotype.Service;

import br.com.wakanda.gestaomecanica.carro.application.api.CarroRequest;
import br.com.wakanda.gestaomecanica.carro.application.api.CarroResponse;
import br.com.wakanda.gestaomecanica.carro.application.repository.CarroRepository;
import br.com.wakanda.gestaomecanica.carro.domain.Carro;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CarroApplicationService implements CarroService {
	private final CarroRepository carroRepository;
	@Override
	public CarroResponse criaCarro(CarroRequest carroRequest) {
		// 3º Test
		log.info("[inicia] CarroApplicationService - criaCarro");
		Carro carro = carroRepository.salva(new Carro(carroRequest));
		log.info("[finaliza] CarroApplicationService - criaCarro");
		return CarroResponse.builder()
				.idCarro(carro.getIdCarro())
				.build();
	}

}
