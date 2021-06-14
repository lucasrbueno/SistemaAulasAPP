package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Aula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAulaRepository extends CrudRepository<Aula, Integer>{
    
}
