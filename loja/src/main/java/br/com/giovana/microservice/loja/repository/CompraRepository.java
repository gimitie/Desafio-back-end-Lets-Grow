package br.com.giovana.microservice.loja.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.giovana.microservice.loja.model.Compra;

public interface CompraRepository extends CrudRepository <Compra, Long> {

}
