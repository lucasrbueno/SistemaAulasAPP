
package br.edu.infnet.appatpb.model.negocio;

public class Texto extends Recurso{
    private int quantidadeLinhas;
    private String fonteDaLetra;
    private String linkReferência;

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

    public String getLinkReferência() {
        return linkReferência;
    }

    public void setLinkReferência(String linkReferência) {
        this.linkReferência = linkReferência;
    }

    @Override
    public String toString() {
        return super.toString() + quantidadeLinhas + fonteDaLetra + linkReferência; 
    }
}
