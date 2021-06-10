package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Imagem;
import br.edu.infnet.appatpb.model.repository.IImagemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagemService {
    
    @Autowired
    private IImagemRepository imagemRepository;
    
    public void incluir(Imagem imagem) {
        imagemRepository.save(imagem);
    }
    
    public List<Imagem> obterLista() {
        return (List<Imagem>) imagemRepository.findAll();
    }

    public void excluir(Integer id) {
        imagemRepository.deleteById(id);
    }
}
