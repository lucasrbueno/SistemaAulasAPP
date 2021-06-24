package br.edu.infnet.appatpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.UsuarioService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class UsuarioController {
	
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private AppController ac;
    
    @GetMapping(value = "/usuario")
    public String telaCadastro() {
       return "usuario/cadastro";
    }    

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        usuarioService.incluir(usuario);

        return "redirect:/";
    }
   
    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        usuarioService.excluir(id);
        
        return "redirect:/usuario/lista";
    }
    
    @GetMapping(value = "/usuario/lista")
    public String obterLista(Model model){   
        model.addAttribute("usuarios", usuarioService.obterLista());
        
        return "usuario/lista";
    }
    
    @PostMapping(value="/usuario/login")
    public String validarLogin(Model model, @RequestParam String email, String senha){
        
        Usuario usuario = usuarioService.autenticacao(email, senha);
        
        if(usuario != null) {
            model.addAttribute("user", usuario);         
            return "redirect:/home";
        } else {
            model.addAttribute("permissao", "Usuário inválido!");
//            return ac.telaLogin();
            return "redirect:/";
        }       
    }
}