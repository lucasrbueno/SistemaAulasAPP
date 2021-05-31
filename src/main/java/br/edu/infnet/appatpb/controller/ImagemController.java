package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Imagem;
import br.edu.infnet.appatpb.model.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImagemController{
	
    @Autowired
    private ImagemService imagemService;

    @PostMapping(value = "/imagem/incluir")
    public String incluir(Imagem imagem) {

        imagemService.incluir(imagem);

        return "redirect:/";
    }
}