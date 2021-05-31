package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Texto;
import br.edu.infnet.appatpb.model.repository.ITextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextoService {
    
    @Autowired
    private ITextoRepository textoRepository;
    
    public void incluir(Texto texto) {
        textoRepository.save(texto);
    }
}
