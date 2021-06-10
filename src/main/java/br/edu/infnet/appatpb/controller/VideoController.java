package br.edu.infnet.appatpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appatpb.model.negocio.Video;
import br.edu.infnet.appatpb.model.service.VideoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VideoController {
	
    @Autowired
    private VideoService videoService;

    @GetMapping(value = "/video")
    public String telaCadastroVideo() {
        return "redirect:/video/lista";
    }

    @PostMapping(value = "/video/incluir")
    public String incluir(Video video) {
        videoService.incluir(video);

        return "redirect:/video/lista";
    }
    
    @GetMapping(value="/video/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        videoService.excluir(id);
        
        return "redirect:/video/lista";
    }
    
    @GetMapping(value = "/video/lista")
    public String obterLista(Model model){   
        model.addAttribute("videos", videoService.obterLista());
        
        return "video/cadastro";
    }
}