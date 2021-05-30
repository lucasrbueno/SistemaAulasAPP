package br.edu.infnet.appatpb.model.negocio;

import java.util.List;

public class Aula {
    private Integer id;
    
    private String materia;
    private String diaDaSemana;
    private boolean arquivo;
    
    private List<Recurso> recurso;
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Recurso> getRecurso() {
        return recurso;
    }

    public void setRecurso(List<Recurso> recurso) {
        this.recurso = recurso;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public boolean isArquivo() {
        return arquivo;
    }

    public void setArquivo(boolean arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", materia=" + materia + ", diaDaSemana=" + diaDaSemana + ", arquivo=" + arquivo + ", recurso=" + recurso + ", autor=" + autor + '}';
    }
    
    
    
}
