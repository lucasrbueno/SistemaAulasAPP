package br.edu.infnet.appatpb.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
    @Autowired
    private IUsuarioRepository pessoaRepository;

    public String obterStatus(Usuario pessoa) {

            return pessoa.calcularSalarioAnual() > 999 ? 
                            pessoa.getNome() + ", que pessoa rica" : 
                                    "Poxa, "+ pessoa.getNome()+"!!! Tá difícil, né?!";  
    }

    public void incluir(Usuario pessoa) {
            pessoaRepository.save(pessoa);
    }
}
