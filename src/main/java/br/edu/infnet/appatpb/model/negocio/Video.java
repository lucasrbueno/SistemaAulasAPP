package br.edu.infnet.appatpb.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TVideo")
public class Video extends Recurso{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String link;
    private float duracao; 
    private boolean mp4;

    public Video(String link, float duracao, boolean mp4) {
        this.link = link;
        this.duracao = duracao;
        this.mp4 = mp4;
    }

    public Video() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMp4() {
        return mp4;
    }

    public void setMp4(boolean mp4) {
        this.mp4 = mp4;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return super.toString() + link + duracao + mp4; 
    }  
}
