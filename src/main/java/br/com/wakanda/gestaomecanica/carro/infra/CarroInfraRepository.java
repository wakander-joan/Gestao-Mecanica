package br.com.wakanda.gestaomecanica.carro.infra;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.wakanda.gestaomecanica.carro.application.repository.CarroRepository;
import br.com.wakanda.gestaomecanica.carro.domain.Carro;
import br.com.wakanda.gestaomecanica.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CarroInfraRepository implements CarroRepository {

	private final CarroSpringDataJPARepository carroSpringDataJPARepository;

	@Override
	public Carro salva(Carro carro) {
		// 4º test
		log.info("[inicia] CarroInfraRepository - salva");
		carroSpringDataJPARepository.save(carro);
		log.info("[finaliza] CarroInfraRepository - salva");
		return carro;
	}

	@Override
	public List<Carro> buscaTodosCarros() {
		log.info("[inicia] CarroInfraRepository - buscaTodosCarros");
		List<Carro> todosCarros = carroSpringDataJPARepository.findAll();
		log.info("[finaliza] CarroInfraRepository - buscaTodosCarros");
		return todosCarros;
	}

	@Override
	public Carro buscaCarroPorPlaca(String placa) {
		log.info("[inicia] CarroInfraRepository - buscaCarroPorPlaca");
		Carro carro = carroSpringDataJPARepository.findByPlaca(placa)
				.orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Carro não encontrado"));
		log.info("[finaliza] CarroInfraRepository - buscaCarroPorPlaca");
		return carro;
	}
}
