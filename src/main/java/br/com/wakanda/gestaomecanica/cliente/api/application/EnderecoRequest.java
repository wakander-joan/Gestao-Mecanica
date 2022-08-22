package br.com.wakanda.gestaomecanica.cliente.api.application;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EnderecoRequest {
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
}
