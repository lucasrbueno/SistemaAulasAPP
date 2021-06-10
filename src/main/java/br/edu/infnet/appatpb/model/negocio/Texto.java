package br.edu.infnet.appatpb.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TTexto")
public class Texto extends Recurso{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private int quantidadeLinhas;
    private String fonteLetra;
    private String linkReferencia;

    public Texto(int quantidadeLinhas, String fonteLetra, String linkReferencia) {
        this.quantidadeLinhas = quantidadeLinhas;
        this.fonteLetra = fonteLetra;
        this.linkReferencia = linkReferencia;
    }

    public Texto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    public void setQuantidadeLinhas(int quantidadeLinhas) {
        this.quantidadeLinhas = quantidadeLinhas;
    }

    public String getFonteLetra() {
        return fonteLetra;
    }

    public void setFonteLetra(String fonteLetra) {
        this.fonteLetra = fonteLetra;
    }

    public String getLinkReferencia() {
        return linkReferencia;
    }

    public void setLinkReferencia(String linkReferencia) {
        this.linkReferencia = linkReferencia;
    }

    @Override
    public String toString() {
        return super.toString() + quantidadeLinhas + fonteLetra + linkReferencia; 
    }
}
