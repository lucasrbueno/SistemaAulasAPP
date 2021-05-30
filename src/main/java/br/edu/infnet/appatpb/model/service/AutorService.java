package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Autor;
import br.edu.infnet.appatpb.model.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    private IAutorRepository autorRepository;
    
    public void incluir(Autor autor) {
        autorRepository.save(autor);
    }
}
