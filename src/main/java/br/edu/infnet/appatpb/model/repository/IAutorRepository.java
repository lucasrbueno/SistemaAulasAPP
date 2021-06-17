package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Autor;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends CrudRepository<Autor, Integer>{
    
    @Query("from Autor au where au.usuario.id =:userid")
    public List<Autor> obterLista(Integer userid, Sort sort);
}
