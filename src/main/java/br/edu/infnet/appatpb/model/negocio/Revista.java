package br.edu.infnet.appatpb.model.negocio;

public class Revista extends Produto {

	private boolean tecnologia;

	public boolean isTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(boolean tecnologia) {
		this.tecnologia = tecnologia;
	}
}