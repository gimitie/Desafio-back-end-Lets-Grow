package br.com.giovana.microservice.loja.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.giovana.microservice.loja.model.Pedido;

public interface PedidoRepository extends CrudRepository <Pedido, Long> {

	List <Pedido> findAll();
}
