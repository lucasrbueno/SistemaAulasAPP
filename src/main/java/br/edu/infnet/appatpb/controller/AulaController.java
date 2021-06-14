package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Aula;
import br.edu.infnet.appatpb.model.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AulaController{
	
    @Autowired
    private AulaService aulaService;
    
    @GetMapping(value = "/aula")
    public String telaCadastroAula() {
        return "redirect:/aula/lista";
    }

    @PostMapping(value = "/aula/incluir")
    public String incluir(Aula aula) {
        aulaService.incluir(aula);

        return "redirect:/aula/lista";
    }
    
    @GetMapping(value="/aula/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        aulaService.excluir(id);
        
        return "redirect:/aula/lista";
    }
    
    @GetMapping(value = "/aula/lista")
    public String obterLista(Model model){   
        model.addAttribute("aulas", aulaService.obterLista());
        
        return "aula/cadastro";
    }
}