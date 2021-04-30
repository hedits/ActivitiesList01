package com.company;

public class Pessoa {
    public String nome;
    public String cpf;
    public String endereco;
    public Conta conta;

    public Pessoa(){}

    public Pessoa(String nome, String cpf, String endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void adicionarConta(Conta conta){
        this.conta = conta;
    }
}
