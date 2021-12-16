package br.com.giovana.microservice.catalogo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.giovana.microservice.catalogo.dto.ListaDeProdutos;
import br.com.giovana.microservice.catalogo.dto.ProdutoDTO;
import br.com.giovana.microservice.catalogo.model.Produto;
import br.com.giovana.microservice.catalogo.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ListaDeProdutos getProdutoAll() {
		
		ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
		listaDeProdutos.setProdutos(produtoRepository.findAll());
		return listaDeProdutos;
	}
	
	public List <ProdutoDTO> getProdutoPorId(Long id) {
		return produtoRepository.findProdutoById(id).stream() 
				.map(produto -> toProdutoDTO(produto)).collect(Collectors.toList());
	}
	
	public List<Produto> getProdutoPorCategoria(String categoria) {
		return produtoRepository.findProdutoByCategoria(categoria);
	}
	
	private ProdutoDTO toProdutoDTO (Produto produto) {
		
		ProdutoDTO produtoDTO = new ProdutoDTO(
				
			produto.getId(),
			produto.getNome(),
			produto.getCategoria(),
			produto.getDescricao(),
			produto.getPreco(),
			produto.getImagem());
		
		return produtoDTO;
	}
	
	public List <ProdutoDTO> getProdutos(){
		
		List<Produto> produtos = produtoRepository.findAll();
		
		return produtos.stream() 
				.map(produto -> toProdutoDTO(produto)).collect(Collectors.toList());
	}
}