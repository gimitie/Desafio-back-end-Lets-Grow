package br.com.giovana.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.giovana.microservice.loja.model.ListaDePedidos;
import br.com.giovana.microservice.loja.service.PedidoService;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	PedidoService pedidoService;

	@GetMapping
	public String getPedidosAnteriores (Model model) {
		
		ListaDePedidos listaDePedidos = pedidoService.getPedidos();
		
		model.addAttribute("listaDePedidos", listaDePedidos);
		
		return "pedidos_anteriores";
	}
}