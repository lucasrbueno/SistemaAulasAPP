package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Imagem;
import br.edu.infnet.appatpb.model.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImagemController{
	
    @Autowired
    private ImagemService imagemService;

    @GetMapping(value = "/imagem")
    public String telaCadastroImagem() {
        return "redirect:/imagem/lista";
    }

    @PostMapping(value = "/imagem/incluir")
    public String incluir(Imagem imagem) {
        imagemService.incluir(imagem);

        return "redirect:/imagem/lista";
    }
    
    @GetMapping(value="/imagem/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        imagemService.excluir(id);
        
        return "redirect:/imagem/lista";
    }
    
    @GetMapping(value = "/imagem/lista")
    public String obterLista(Model model){   
        model.addAttribute("imagens", imagemService.obterLista());
        
        return "imagem/cadastro";
    }
}