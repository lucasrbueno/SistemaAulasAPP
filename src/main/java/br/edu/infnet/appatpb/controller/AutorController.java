package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Autor;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AulaService;
import br.edu.infnet.appatpb.model.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class AutorController{
	
    @Autowired
    private AutorService autorService;
    
    @GetMapping(value = "/autor")
    public String telaCadastroAutor() {
        return "redirect:/autor/lista";
    }

    @PostMapping(value = "/autor/incluir")
    public String incluir(Autor autor, @SessionAttribute("user") Usuario usuario) {
        autor.setUsuario(usuario);
        
        autorService.incluir(autor);

        return "redirect:/autor/lista";
    }
    
    @GetMapping(value="/autor/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        autorService.excluir(id);
        
        return "redirect:/autor/lista";
    }
    
    @GetMapping(value = "/autor/lista")
    public String obterLista(Model model, @SessionAttribute("user") Usuario usuario){   
        model.addAttribute("autores", autorService.obterLista(usuario));
        
        return "autor/cadastro";
    }
}