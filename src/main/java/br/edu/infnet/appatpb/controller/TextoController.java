package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Texto;
import br.edu.infnet.appatpb.model.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TextoController{
	
    @Autowired
    private TextoService textoService;

    @GetMapping(value = "/texto")
    public String telaCadastroTexto() {
        return "redirect:/texto/lista";
    }

    @PostMapping(value = "/texto/incluir")
    public String incluir(Texto texto) {
        textoService.incluir(texto);

        return "redirect:/texto/lista";
    }
    
    @GetMapping(value="/texto/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        textoService.excluir(id);
        
        return "redirect:/texto/lista";
    }
    
    @GetMapping(value = "/texto/lista")
    public String obterLista(Model model){   
        model.addAttribute("textos", textoService.obterLista());
        
        return "texto/cadastro";
    }
}