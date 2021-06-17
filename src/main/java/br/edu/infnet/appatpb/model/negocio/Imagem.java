package br.edu.infnet.appatpb.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TImagem")
@PrimaryKeyJoinColumn(name = "idRecurso")
public class Imagem extends Recurso {   
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private boolean png;
    private float tamanho;
    private String placeholder;
    
    public Imagem(boolean png, float tamanho, String placeholder) {
        this.png = png;
        this.tamanho = tamanho;
        this.placeholder = placeholder;
    }

    public Imagem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public boolean isPng() {
        return png;
    }

    public void setPng(boolean png) {
        this.png = png;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public String toString() {
        return super.toString() + png + tamanho + placeholder;
    }   
}
