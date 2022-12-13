package main.annotation.domain;

import main.annotation.maxValue;

public class Conta {

    public Conta(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    String nome;

    // anotando o campo e passando um valor para a anotação
    @maxValue(value = 3000)
    int saldo;
}
