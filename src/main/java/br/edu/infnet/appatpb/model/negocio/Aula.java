package br.edu.infnet.appatpb.model.negocio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TAula")
public class Aula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String materia;
    private String diaDaSemana;
    private boolean arquivo;
    
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="idAutor")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
  
    @Transient
    private List<Recurso> recurso;

    public Aula() {
    }

    public Aula(String materia, String diaDaSemana, boolean arquivo) {
        this.materia = materia;
        this.diaDaSemana = diaDaSemana;
        this.arquivo = arquivo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Recurso> getRecurso() {
        return recurso;
    }

    public void setRecurso(List<Recurso> recurso) {
        this.recurso = recurso;
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
        return "Aula{" + "id=" + id + ", materia=" + materia + ", diaDaSemana=" + diaDaSemana + ", arquivo=" + arquivo + '}';
    } 
}
