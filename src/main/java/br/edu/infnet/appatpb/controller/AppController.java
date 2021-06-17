package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AulaService;
import br.edu.infnet.appatpb.model.service.AutorService;
import br.edu.infnet.appatpb.model.service.ImagemService;
import br.edu.infnet.appatpb.model.service.TextoService;
import br.edu.infnet.appatpb.model.service.UsuarioService;
import br.edu.infnet.appatpb.model.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AppController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private AutorService autorService;
    
    @Autowired
    private AulaService aulaService;
    
    @Autowired
    private TextoService textoService;
    
    @Autowired
    private ImagemService imagemService;
    
    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String telaLogin() {
        return "login";
    }      

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String telaIndex(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("usuarioQtd", usuarioService.obterLista().size());
        model.addAttribute("autorQtd", autorService.obterLista(usuario).size());
        model.addAttribute("aulaQtd", aulaService.obterLista(usuario).size());
        model.addAttribute("textoQtd", textoService.obterLista().size());
        model.addAttribute("videoQtd", videoService.obterLista().size());
        model.addAttribute("imagemQtd", imagemService.obterLista().size());

        return "index";
    }                
}