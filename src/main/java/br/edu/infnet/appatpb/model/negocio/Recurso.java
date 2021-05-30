package br.edu.infnet.appatpb.model.negocio;

public abstract class Recurso {
    private Integer id;
    
    private String descricao;
    private String titulo;
    private int quantidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Recurso{" + "id=" + id + ", descricao=" + descricao + ", titulo=" + titulo + ", quantidade=" + quantidade + '}';
    }

}
