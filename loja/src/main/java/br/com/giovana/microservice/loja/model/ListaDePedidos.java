package br.com.giovana.microservice.loja.model;

import java.util.List;

import br.com.giovana.microservice.loja.dto.PedidoDTO;

public class ListaDePedidos {
	
	List <PedidoDTO> listaDePedidosDTO;

	public List<PedidoDTO> getListaDePedidosDTO() {
		return listaDePedidosDTO;
	}

	public void setListaDePedidosDTO(List<PedidoDTO> listaDePedidosDTO) {
		this.listaDePedidosDTO = listaDePedidosDTO;
	}
}
