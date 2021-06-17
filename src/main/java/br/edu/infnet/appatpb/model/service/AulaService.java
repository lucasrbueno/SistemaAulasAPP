package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Aula;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IAulaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AulaService {
    
    @Autowired
    private IAulaRepository aulaRepository;
    
    public void incluir(Aula aula) {
        aulaRepository.save(aula);
    }

    public List<Aula> obterLista(Usuario usuario) {
        return (List<Aula>) aulaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "materia"));
    }

    public void excluir(Integer id) {
        aulaRepository.deleteById(id);
    }
}
