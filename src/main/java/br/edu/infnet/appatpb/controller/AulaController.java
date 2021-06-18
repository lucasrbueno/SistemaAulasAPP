package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Aula;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AulaService;
import br.edu.infnet.appatpb.model.service.AutorService;
import br.edu.infnet.appatpb.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class AulaController{
	
    @Autowired
    private AulaService aulaService;
    
    @Autowired
    private AutorService autorService;
    
    @GetMapping(value = "/aula")
    public String telaCadastroAula(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("autores", autorService.obterLista(usuario));
        
        return "aula/cadastro";
    }

    @PostMapping(value = "/aula/incluir")
    public String incluir(Aula aula, @SessionAttribute("user") Usuario usuario) {
        
        aula.setUsuario(usuario);
        
        aulaService.incluir(aula);

        return "redirect:/aula/lista";
    }
    
    @GetMapping(value="/aula/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        aulaService.excluir(id);
        
        return "redirect:/aula/lista";
    }
    
    @GetMapping(value = "/aula/lista")
    public String obterLista(Model model, @SessionAttribute("user") Usuario usuario){   
        model.addAttribute("aulas", aulaService.obterLista(usuario));
        
        
        return "aula/lista";
    }
}