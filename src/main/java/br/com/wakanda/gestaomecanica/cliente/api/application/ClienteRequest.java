package br.com.wakanda.gestaomecanica.cliente.api.application;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.wakanda.gestaomecanica.cliente.domain.Endereco;
import br.com.wakanda.gestaomecanica.cliente.domain.Sexo;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
public class ClienteRequest {
	@NotBlank
	private String nome;
	@NotNull
	private Endereco endereço;
	@NotBlank
	private String celular;
	private String Telefone;
	@NotBlank
	@Email
	private String email;
	@NotNull
	private Boolean aceitaTermos;
	private Sexo sexo;
	@CPF
	private String cpf;
}
