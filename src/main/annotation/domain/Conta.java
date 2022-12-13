package main.annotation.domain;

import main.annotation.maxValue;

public class Conta {

    public Conta(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    String nome;

    @maxValue(value = 3000)
    int saldo;
}
