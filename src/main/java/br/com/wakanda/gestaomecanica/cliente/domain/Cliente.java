package br.com.wakanda.gestaomecanica.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.wakanda.gestaomecanica.cliente.api.application.ClienteRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Cliente {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nome;
	@NotNull
	private Endereco endereço;
	@NotBlank
	private String celular;
	private String Telefone;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotNull
	private Boolean aceitaTermos;
	private Sexo sexo;
	@CPF
	@Column(unique = true)
	private String cpf;
	
	private LocalDateTime dataHoraDoCadastro;

	public Cliente(ClienteRequest clienteRequest) {
		this.nome = clienteRequest.getNome();
		this.endereço = clienteRequest.getEndereço();
		this.celular = clienteRequest.getCelular();
		this.Telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.sexo = clienteRequest.getSexo();
		this.cpf = clienteRequest.getCpf();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
}
