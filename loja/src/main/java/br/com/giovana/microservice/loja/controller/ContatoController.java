package br.com.giovana.microservice.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

	@GetMapping("/contato")
	public String contato(Model model) {
		
		return "contato";
	}
}
