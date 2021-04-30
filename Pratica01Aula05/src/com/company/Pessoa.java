package com.company;

public class Pessoa {
    private String nome;
    private int idade;
    private String cnh;

    public Pessoa(String nome, int idade, String cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public void dirigir(){
        System.out.println("Pessoa esta dirigindo...");
    }

    public void dormir(){
        System.out.println("Pessoa esta dormindo...");
    }

    public void comer(){
        System.out.println("Pessoa esta comendo...");
    }
}
