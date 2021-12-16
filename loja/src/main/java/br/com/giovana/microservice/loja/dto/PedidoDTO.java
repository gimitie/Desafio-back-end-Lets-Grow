package br.com.giovana.microservice.loja.dto;

import br.com.giovana.microservice.loja.model.PedidoStatus;

public class PedidoDTO {
		
		private Long id;
		
		private Long produtoId;
		
		private Integer tempoDePreparo;
		
		private PedidoStatus status;
		
		public PedidoDTO() {
		}
		
		public PedidoDTO(Long id, Long produtoId, Integer tempoDePreparo, PedidoStatus status) {
			this.id = id;
			this.produtoId = produtoId;
			this.tempoDePreparo = tempoDePreparo;
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

		public PedidoStatus getStatus() {
			return status;
		}

		public void setStatus(PedidoStatus status) {
			this.status = status;
		}
}
