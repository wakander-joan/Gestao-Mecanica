package br.com.wakanda.gestaomecanica.carro.infra;

import org.springframework.stereotype.Repository;

import br.com.wakanda.gestaomecanica.carro.application.repository.CarroRepository;
import br.com.wakanda.gestaomecanica.carro.domain.Carro;
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

}
