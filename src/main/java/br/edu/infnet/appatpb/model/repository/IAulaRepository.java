package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Aula;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAulaRepository extends CrudRepository<Aula, Integer>{
    
    @Query("from Aula a where a.usuario.id =:userid")
    public List<Aula> obterLista(Integer userid, Sort sort);
}
