package br.com.giovana.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.giovana.microservice.loja.dto.ListaDeProdutosDTO;
import br.com.giovana.microservice.loja.service.CardapioService;

@Controller
@RequestMapping("cardapio")
public class CardapioController {
	
	@Autowired
	CardapioService cardapioService;
	
	@GetMapping()
	public String getProdutos (Model model) {
		
		ListaDeProdutosDTO produtos = cardapioService.mostrarProdutos();
	    
		model.addAttribute("produtos", produtos);
		
		return "cardapio";
	}
}