package br.com.giovana.microservice.catalogo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.giovana.microservice.catalogo.model.Produto;

public interface ProdutoRepository extends CrudRepository <Produto, Long> {
	
	List <Produto> findProdutoByCategoria(String categoria);
	
	List<Produto> findByIdIn(List <Long> ids);
	
	List <Produto> findProdutoById(Long id);
	
	List<Produto> findAll();
}