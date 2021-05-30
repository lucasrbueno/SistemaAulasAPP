package br.edu.infnet.appatpb.model.negocio;

public class Video extends Recurso{
    private String link;
    private float duracao; 
    private boolean mp4;

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
