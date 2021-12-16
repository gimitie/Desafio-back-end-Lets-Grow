package br.com.giovana.microservice.loja;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.giovana.microservice.loja.dto.ListaDeProdutosDTO;
import br.com.giovana.microservice.loja.dto.ProdutoDTO;

@FeignClient("catalogo")
public interface CatalogoClient {
	
	@RequestMapping(value="/produto/prod", method = RequestMethod.GET)
	ListaDeProdutosDTO getProdutos();
	
	@RequestMapping("/produto/{id}")
	List <ProdutoDTO> mostrarProdutoPorId(@PathVariable Long id);
	
	@RequestMapping("/produto/{categoria}")
	List <ProdutoDTO> mostrarProdutoPorCategoria(@PathVariable String categoria);
}
