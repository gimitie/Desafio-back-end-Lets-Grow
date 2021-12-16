package br.com.giovana.microservice.loja.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long produtoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;
	
	@Enumerated(EnumType.STRING)
	private PedidoStatus status;
	
	public Compra() {
		
	}

	public Compra(Long produtoId, Integer tempoDePreparo, String enderecoDestino, PedidoStatus status) {
		super();
		this.produtoId = produtoId;
		this.tempoDePreparo = tempoDePreparo;
		this.enderecoDestino = enderecoDestino;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
	
	
}