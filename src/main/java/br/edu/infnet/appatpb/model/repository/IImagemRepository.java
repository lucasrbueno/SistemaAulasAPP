package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Imagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImagemRepository extends CrudRepository<Imagem, Integer>{
    
}
