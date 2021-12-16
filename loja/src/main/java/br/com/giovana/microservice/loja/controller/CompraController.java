package br.com.giovana.microservice.loja.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.giovana.microservice.loja.dto.CompraDTO;
import br.com.giovana.microservice.loja.dto.ProdutoDTO;
import br.com.giovana.microservice.loja.service.CompraService;

@Controller
@RequestMapping("compra")
public class CompraController {
	
	@Autowired
	CompraService compraService;
	
	@PostMapping
	public String realizarCompra (@Valid CompraDTO compra, BindingResult result) {
		
		compraService.realizarCompra(compra);
		return "redirect:/home";
	}
	
	@GetMapping
	public String paginaCompra (CompraDTO compra) {
		
		return "compra";
	}
	
	@GetMapping("/{id}")
	public String getProdutosPorId(@PathVariable Long id, Model model) {
		
		List <ProdutoDTO> produto = compraService.getProdutosPorId(id);
		model.addAttribute("produto", produto);		
		return "compra";
	}
}