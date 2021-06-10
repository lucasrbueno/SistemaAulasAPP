package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Autor;
import br.edu.infnet.appatpb.model.repository.IAutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    private IAutorRepository autorRepository;
    
    public void incluir(Autor autor) {
        autorRepository.save(autor);
    }

    public List<Autor> obterLista() {
        return (List<Autor>) autorRepository.findAll();
    }

    public void excluir(Integer id) {
        autorRepository.deleteById(id);
    }
}
