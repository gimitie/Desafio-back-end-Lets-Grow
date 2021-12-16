package br.com.giovana.microservice.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.giovana.microservice.catalogo.dto.ListaDeProdutos;
import br.com.giovana.microservice.catalogo.dto.ProdutoDTO;
import br.com.giovana.microservice.catalogo.model.Produto;
import br.com.giovana.microservice.catalogo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value="/prod", method = RequestMethod.GET)
	public ListaDeProdutos mostrarProdutos () {
		return produtoService.getProdutoAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List <ProdutoDTO> mostrarProdutoPorId(@PathVariable Long id) {
		return produtoService.getProdutoPorId(id);
	}
	
	@RequestMapping(value = "/categoria/{categoria}", method = RequestMethod.GET)
	public List <Produto> mostrarProdutoPorCategoria(@PathVariable String categoria) {
		return produtoService.getProdutoPorCategoria(categoria);
	}
}