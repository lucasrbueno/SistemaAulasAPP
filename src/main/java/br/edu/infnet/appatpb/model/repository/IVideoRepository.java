package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Video;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideoRepository extends CrudRepository<Video, Integer>{
    
    List<Video> findAllByOrderByTitulo();
}
