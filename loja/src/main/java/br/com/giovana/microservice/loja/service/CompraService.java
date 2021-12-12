package br.com.giovana.microservice.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.giovana.microservice.loja.client.FornecedorClient;
import br.com.giovana.microservice.loja.dto.CompraDTO;
import br.com.giovana.microservice.loja.dto.InfoFornecedorDTO;
import br.com.giovana.microservice.loja.dto.InfoPedidoDTO;
import br.com.giovana.microservice.loja.model.Compra;

@Service
public class CompraService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public Compra realizaCompra(CompraDTO compra) {
	
		final String estado = compra.getEndereco().getEstado();
		
		LOG.info("buscando informações do fornecedor de {}", estado);
		
		LOG.info("realizando um pedido");
		
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(estado);
		
		InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compra.getItens());
		
		System.out.println(info);
		
		Compra compraSalva = new Compra();
		
		compraSalva.setPedidoId(pedido.getId());
		compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
		compraSalva.setEnderecoDestino(compra.getEndereco().toString());
		
		return compraSalva;
	}	
}