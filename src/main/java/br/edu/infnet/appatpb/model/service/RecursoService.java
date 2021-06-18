package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Recurso;
import br.edu.infnet.appatpb.model.negocio.Video;
import br.edu.infnet.appatpb.model.repository.IRecursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecursoService {
    
    @Autowired
    private IRecursoRepository recursoRepository;
    
    public void incluir(Recurso recurso) {
        recursoRepository.save(recurso);
    }
    
    public List<Recurso> obterLista() {
        return (List<Recurso>) recursoRepository.findAll();
    }

    public void excluir(Integer id) {
        recursoRepository.deleteById(id);
    }
}
