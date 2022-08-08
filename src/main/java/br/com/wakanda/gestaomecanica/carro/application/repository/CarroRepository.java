package br.com.wakanda.gestaomecanica.carro.application.repository;

import java.util.List;
import br.com.wakanda.gestaomecanica.carro.domain.Carro;

public interface CarroRepository {
	Carro salva(Carro carro);
	List<Carro> buscaTodosCarros();
	Carro buscaCarroPorPlaca(String placa);
}
