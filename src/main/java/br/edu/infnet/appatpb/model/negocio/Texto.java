
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
    private String fonteDaLetra;
    private String linkReferencia;

    public Texto(int quantidadeLinhas, String fonteDaLetra, String linkReferencia) {
        this.quantidadeLinhas = quantidadeLinhas;
        this.fonteDaLetra = fonteDaLetra;
        this.linkReferencia = linkReferencia;
    }

    public Texto() {
    }

    public int getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    public void setQuantidadeLinhas(int quantidadeLinhas) {
        this.quantidadeLinhas = quantidadeLinhas;
    }

    public String getFonteDaLetra() {
        return fonteDaLetra;
    }

    public void setFonteDaLetra(String fonteDaLetra) {
        this.fonteDaLetra = fonteDaLetra;
    }

    public String getLinkReferencia() {
        return linkReferencia;
    }

    public void setLinkReferencia(String linkReferencia) {
        this.linkReferencia = linkReferencia;
    }

    @Override
    public String toString() {
        return super.toString() + quantidadeLinhas + fonteDaLetra + linkReferencia; 
    }
}
