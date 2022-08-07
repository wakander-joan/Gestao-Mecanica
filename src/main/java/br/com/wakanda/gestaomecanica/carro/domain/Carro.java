package br.com.wakanda.gestaomecanica.carro.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.wakanda.gestaomecanica.carro.application.api.CarroRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE) 
@Getter
@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
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

	public Carro(CarroRequest carroRequest) {
		this.placa = carroRequest.getPlaca();
		this.marca = carroRequest.getMarca();
		this.modelo = carroRequest.getModelo();
		this.motor = carroRequest.getMotor();
		this.ano = carroRequest.getAno();
		this.cor = carroRequest.getCor();
		this.eletronico = carroRequest.getEletronico();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
}
