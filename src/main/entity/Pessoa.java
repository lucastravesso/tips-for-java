package main.entity;

import java.util.List;

public class Pessoa {

    public Pessoa(){}

    public Pessoa(String nome, List<String> roupas){
        this.nome = nome;
        this.roupas = roupas;
    }

    private String nome;

    private List<String> roupas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getRoupas() {
        return roupas;
    }

    public void setRoupas(List<String> roupas) {
        this.roupas = roupas;
    }


}
