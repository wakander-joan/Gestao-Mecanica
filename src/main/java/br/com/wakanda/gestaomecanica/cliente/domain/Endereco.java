package br.com.wakanda.gestaomecanica.cliente.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import br.com.wakanda.gestaomecanica.cliente.api.application.EnderecoRequest;
import lombok.Getter;

@Getter
public class Endereco {
	@NotBlank
	private String rua;
	@NotBlank
	private int numero;
	private String referencia;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;
	
	public Endereco(EnderecoRequest enderecoRequest) {
		this.rua = enderecoRequest.getRua();
		this.numero = enderecoRequest.getNumero();
		this.referencia = enderecoRequest.getReferencia();
		this.bairro = enderecoRequest.getBairro();
		this.cidade = enderecoRequest.getCidade();
		this.estado = enderecoRequest.getEstado();
	}
	
	
}
