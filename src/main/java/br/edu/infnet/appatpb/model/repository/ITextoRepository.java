package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Texto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITextoRepository extends CrudRepository<Texto, Integer>{
    
}
