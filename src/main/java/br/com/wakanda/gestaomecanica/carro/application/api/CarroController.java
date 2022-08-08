package br.com.wakanda.gestaomecanica.carro.application.api;

import java.util.List;

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

	@Override
	public List<CarroListResponse> getTodosCarros() {
		log.info("[inicia] CarroController - getTodosCarros");
		List<CarroListResponse> carros = carroService.buscaTodosCarros();
		log.info("[finaliza] CarroController - getTodosCarros");
		return carros;
	}

//	@Override
//	public CarroDetalhadoResponse getCarroPorId(UUID idCarro) {
//		log.info("[inicia] CarroController - getCarroPorId");
//		log.info("[idCarro] {}", idCarro);
//		log.info("[finaliza] CarroController - getCarroPorId");
//		return null;
//	}

	@Override
	public CarroDetalhadoResponse getCarroPorPlaca(String placa) {
		log.info("[inicia] CarroController - getCarroPorPlaca");
		log.info("[placa] {}", placa);
		CarroDetalhadoResponse carroDetalhado = carroService.buscaCarroPorPlaca(placa);
		log.info("[finaliza] CarroController - getCarroPorPlaca");
		return carroDetalhado;
	}

}
