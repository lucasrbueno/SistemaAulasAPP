package br.edu.infnet.appatpb.model.negocio;

public class Imagem extends Recurso {
    private boolean png;
    private float tamanho;
    private String placeholder;

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
