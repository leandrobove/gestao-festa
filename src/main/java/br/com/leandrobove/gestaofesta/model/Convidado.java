package br.com.leandrobove.gestaofesta.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer quantidadeDeAcompanhantes;

	public Convidado() {
	}

	public Convidado(Long id, String nome, Integer quantidadeDeAcompanhantes) {
		this.id = id;
		this.nome = nome;
		this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDeAcompanhantes() {
		return quantidadeDeAcompanhantes;
	}

	public void setQuantidadeDeAcompanhantes(Integer quantidadeDeAcompanhantes) {
		this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
	}

	@Override
	public String toString() {
		return "Convidado [id=" + id + ", nome=" + nome + ", quantidadeDeConvidados=" + quantidadeDeAcompanhantes + "]";
	}

}
