package br.com.giovana.microservice.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.giovana.microservice.loja.CatalogoClient;
import br.com.giovana.microservice.loja.dto.ListaDeProdutosDTO;
import br.com.giovana.microservice.loja.dto.ProdutoDTO;

@Service
public class CardapioService {
	
	@Autowired
	private CatalogoClient catalogoClient;
	
	public ListaDeProdutosDTO mostrarProdutos() {
		
		return catalogoClient.getProdutos();
	}
	
	public List<ProdutoDTO> mostrarProdutoPorId(@PathVariable Long id) { 
	
		List <ProdutoDTO> produtos = catalogoClient.mostrarProdutoPorId(id);
		return produtos;
	}
	
	public List <ProdutoDTO> mostrarProdutoPorCategoria(@PathVariable String categoria) { 
		
		List <ProdutoDTO> produtos = catalogoClient.mostrarProdutoPorCategoria(categoria);
		return produtos;
	}
}