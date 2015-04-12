package br.com.devmedia.jdbc.entity;

import java.util.Date;

public class Pessoa {

	private Long id;

	private String nome;

	private String profissao;

	private Date nascimento;

	public Pessoa() {
	}

	public Pessoa(Long id, String nome, String profissao, Date nascimento) {
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		this.nascimento = nascimento;
	}

	public Pessoa(String nome, String profissao, Date nascimento) {
		this.nome = nome;
		this.profissao = profissao;
		this.nascimento = nascimento;
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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
