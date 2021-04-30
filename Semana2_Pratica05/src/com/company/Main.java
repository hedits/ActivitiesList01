package com.company;

public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Edith");
        pessoa1.setConta(new Conta(2, "Edith",250.00));
        pessoa1.setEndereco("Rua da Boa Vista N° 307");
        pessoa1.setCpf("999.888.777-09");

        pessoa2.setNome("Maysa");
        pessoa2.setConta(new Conta(2, "Edith",450.00));
        pessoa2.setEndereco("Rua da Boa Vista N° 500");
        pessoa2.setCpf("555.888.666-01");

        pessoa3.setNome("Leticia");
        pessoa3.setConta(new Conta(2, "Edith",2250.00));
        pessoa3.setEndereco("Rua da Boa Vista N° 190");
        pessoa3.setCpf("333.888.555-23");

        // Implemtar mostrar os clientes.
        System.out.println("Nome: " + pessoa1.getNome());
    }
}
