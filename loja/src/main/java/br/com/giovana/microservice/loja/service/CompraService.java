package br.com.giovana.microservice.loja.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.giovana.microservice.loja.CatalogoClient;
import br.com.giovana.microservice.loja.dto.CompraDTO;
import br.com.giovana.microservice.loja.dto.ProdutoDTO;
import br.com.giovana.microservice.loja.model.Compra;
import br.com.giovana.microservice.loja.model.Pedido;
import br.com.giovana.microservice.loja.model.PedidoStatus;
import br.com.giovana.microservice.loja.repository.CompraRepository;
import br.com.giovana.microservice.loja.repository.PedidoRepository;

@Service
public class CompraService {
	
	@Autowired
	private CatalogoClient catalogoClient;
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<ProdutoDTO> getProdutosPorId(Long id) { 
		
		List <ProdutoDTO> produtos = catalogoClient.mostrarProdutoPorId(id);
		
		return produtos;
	}
	
	public void realizarCompra(@Valid CompraDTO compra) {
		
		compra.setStatus(PedidoStatus.RECEBIDO);
		compra.setTempoDePreparo(1);
		Compra compraSalva = compraRepository.save(toCompra(compra));
		
		Pedido pedido = new Pedido(
				compraSalva.getId(),
				compraSalva.getProdutoId(),
				compraSalva.getTempoDePreparo(),
				compraSalva.getStatus());
		
		pedidoRepository.save(pedido);
	}
	 
	private Compra toCompra(CompraDTO compraDTO) {
		
		return new Compra(
				compraDTO.getProdutoId(),
				compraDTO.getTempoDePreparo(),
				compraDTO.getEnderecoDestino(),
				compraDTO.getStatus());
	}
}