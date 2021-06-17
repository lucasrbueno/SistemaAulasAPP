package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Video;
import br.edu.infnet.appatpb.model.repository.IVideoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    
    @Autowired
    private IVideoRepository videoRepository;
    
    public void incluir(Video video) {
        videoRepository.save(video);
    }
    
    public List<Video> obterLista() {
        return (List<Video>) videoRepository.findAllByOrderByTitulo();
    }

    public void excluir(Integer id) {
        videoRepository.deleteById(id);
    }
}
