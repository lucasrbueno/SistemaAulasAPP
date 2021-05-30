package br.edu.infnet.appatpb.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAutor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String cargo;
    private boolean empregado;

    public Autor() {
        
    }

    public Autor(String nome, String cargo, boolean empregado) {
        this.nome = nome;
        this.cargo = cargo;
        this.empregado = empregado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("O %s %s é um autor e está %b!",
                cargo,
                nome,
                empregado);
    }  
    
//    public static void incrementarID(Integer id){
//        
//    }
}
