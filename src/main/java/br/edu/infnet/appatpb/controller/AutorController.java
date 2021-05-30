package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Autor;
import br.edu.infnet.appatpb.model.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutorController{
	
    @Autowired
    private AutorService autorService;

    @PostMapping(value = "/autor/incluir")
    public String incluir(Autor autor) {

            autorService.incluir(autor);

            return "redirect:/";
    }
}