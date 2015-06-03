package br.com.appteste.entidade;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Dispositivo {
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "geradorDispositivo")
	@SequenceGenerator(name = "geradorDispositivo", sequenceName = "geradorDispositivo", initialValue = 1, allocationSize = 1)
	private int id;
	private String nome;
	private Double valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
