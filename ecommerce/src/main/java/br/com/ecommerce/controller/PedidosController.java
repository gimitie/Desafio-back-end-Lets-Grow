package br.com.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ecommerce.model.Pedido;

@Controller
public class PedidosController {

	@GetMapping("/pedidos")
	public String pedidos(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Vegan Salad");
		pedido.setUrlImagem("https://i2.wp.com/simple-veganista.com/wp-content/uploads/2019/07/vegan-cobb-salad_.jpg");
		pedido.setUrlProduto("https://cursos.alura.com.br/course/spring-mvc-thymeleaf-bootstrap/task/80868");
		pedido.setDescricaoProduto("Uma descrição qualquer!");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "pedidos";
	}

}