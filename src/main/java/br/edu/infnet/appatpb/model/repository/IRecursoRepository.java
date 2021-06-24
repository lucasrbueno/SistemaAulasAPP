package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Recurso;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecursoRepository extends CrudRepository<Recurso, Integer>{
    
    List<Recurso> findAllByOrderByTitulo();
}
