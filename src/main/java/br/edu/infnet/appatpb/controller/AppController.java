package br.edu.infnet.appatpb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String telaInicial() {
		return "index";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String telaCadastro() {
		return "usuario/cadastro";
	}
}