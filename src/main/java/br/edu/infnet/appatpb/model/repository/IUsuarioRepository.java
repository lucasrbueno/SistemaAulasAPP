package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    @Query("from Usuario u where u.email= :email and u.senha= :senha")
    public Usuario autenticacao(String email, String senha);  
        
    List<Usuario> findAllByOrderByNome();
}