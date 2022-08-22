package br.com.wakanda.gestaomecanica.cliente.api.application;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest, EnderecoRequest enderecoRequest) {
		log.info("[start] ClienteController - postCliente");
		log.info("[finish] ClienteController - postCliente");
		return null;
	}

}
