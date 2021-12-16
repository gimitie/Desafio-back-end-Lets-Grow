package br.com.giovana.microservice.catalogo.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.giovana.microservice.catalogo.model.Produto;

public class ListaDeProdutos {

	public void adicionar(Produto produto) {
		
		this.produtos.add(produto);
	}
	
	private List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}