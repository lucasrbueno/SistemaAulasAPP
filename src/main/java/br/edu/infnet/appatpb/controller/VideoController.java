package br.edu.infnet.appatpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appatpb.model.negocio.Video;
import br.edu.infnet.appatpb.model.service.VideoService;

@Controller
public class VideoController {
	
    @Autowired
    private VideoService videoService;

    @PostMapping(value = "/video/incluir")
    public String incluir(Video video) {

        videoService.incluir(video);

        return "redirect:/";
    }
}