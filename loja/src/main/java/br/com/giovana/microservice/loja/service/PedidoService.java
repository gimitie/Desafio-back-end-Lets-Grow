package br.com.giovana.microservice.loja.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.giovana.microservice.loja.dto.PedidoDTO;
import br.com.giovana.microservice.loja.model.ListaDePedidos;
import br.com.giovana.microservice.loja.model.Pedido;
import br.com.giovana.microservice.loja.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public ListaDePedidos getPedidos() {
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		
		ListaDePedidos listaDePedidos = new ListaDePedidos();
		
		List <PedidoDTO> pedidoDTO = pedidos.stream()
				.map(p -> toPedidoDTO(p)).collect(Collectors.toList());
		
		listaDePedidos.setListaDePedidosDTO(pedidoDTO);
		
		return listaDePedidos;
	}
	
	private PedidoDTO toPedidoDTO(Pedido pedido) {
		
		return new PedidoDTO(
				pedido.getId(),
				pedido.getProdutoId(),
				pedido.getTempoDePreparo(),
				pedido.getStatus());
	}
}