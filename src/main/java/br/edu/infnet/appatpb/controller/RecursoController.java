package br.edu.infnet.appatpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.edu.infnet.appatpb.model.service.RecursoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RecursoController {
	
    @Autowired
    private RecursoService recursoService;
    
    @GetMapping(value="/recurso/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        recursoService.excluir(id);
        
        return "redirect:/recurso/lista";
    }
    
    @GetMapping(value = "/recurso/lista")
    public String obterLista(Model model){   
        model.addAttribute("recursos", recursoService.obterLista());
        
        return "recurso/lista";
    }
}