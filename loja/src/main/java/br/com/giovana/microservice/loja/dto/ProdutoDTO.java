package br.com.giovana.microservice.loja.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ProdutoDTO {

	private Long id;
	
	private String nome;
	
	private String categoria;
	
	private String descricao;
	
	private BigDecimal preco;

	private String imagem;
	
	public ProdutoDTO() {
		
	}

	public ProdutoDTO(Long id, String nome, String categoria, String descricao, BigDecimal preco, String imagem) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}