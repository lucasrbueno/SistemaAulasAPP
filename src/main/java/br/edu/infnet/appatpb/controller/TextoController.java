package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Texto;
import br.edu.infnet.appatpb.model.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TextoController{
	
    @Autowired
    private TextoService textoService;

    @PostMapping(value = "/texto/incluir")
    public String incluir(Texto texto) {

        textoService.incluir(texto);

        return "redirect:/";
    }
}