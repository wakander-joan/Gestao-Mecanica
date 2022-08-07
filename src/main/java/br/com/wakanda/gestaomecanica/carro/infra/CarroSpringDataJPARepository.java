package br.com.wakanda.gestaomecanica.carro.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wakanda.gestaomecanica.carro.domain.Carro;

public interface CarroSpringDataJPARepository extends JpaRepository<Carro, UUID> {

}
