package br.com.appteste.entidade;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "geradorUsuario")
	@SequenceGenerator(name = "geradorUsuario", sequenceName = "geradorUsuario", initialValue = 1, allocationSize = 1)
	private int id;
	private String nome;
	private String login;
	private String Senha;
	
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}	
}
