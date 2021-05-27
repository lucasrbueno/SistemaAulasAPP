package br.edu.infnet.appatpb.model.testes;

import br.edu.infnet.appatpb.model.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNome("Elberth");
		u1.setEmail("elberth@elberth.com");
		System.out.println("Usuário: " + u1);
		
		Usuario u2 = new Usuario("Maria", "maria@maria.com");
		u2.setId(2);
		System.out.println("Usuário: " + u2);
	}
}