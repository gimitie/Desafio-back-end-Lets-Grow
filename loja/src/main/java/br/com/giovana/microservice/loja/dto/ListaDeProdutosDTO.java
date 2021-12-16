package br.com.giovana.microservice.loja.dto;

import java.util.List;

public class ListaDeProdutosDTO {

	private List<ProdutoDTO> produtos;

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}
}