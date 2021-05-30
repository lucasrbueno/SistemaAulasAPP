package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends CrudRepository<Autor, Integer>{
    
}
