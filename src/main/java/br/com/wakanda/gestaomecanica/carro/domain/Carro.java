package br.com.wakanda.gestaomecanica.carro.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE) 
@Getter
@Entity
public class Carro {
	@Id
	private UUID idCarro;
	@NotBlank
	private String placa;
	@NotBlank
	private String marca;
	@NotBlank
	private String modelo;
	@NotBlank
	private String motor;
	@NotBlank
	private String ano;
	@NotBlank
	private String cor;
	@NotNull
	private Boolean eletronico;
	
	private LocalDateTime dataHoraDoCadastro;

	public Carro(@NotBlank String placa, @NotBlank String marca, @NotBlank String modelo, @NotBlank String motor,
			@NotBlank String ano, @NotBlank String cor, @NotNull Boolean eletronico) {
		this.idCarro = UUID.randomUUID();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.ano = ano;
		this.cor = cor;
		this.eletronico = eletronico;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
}
