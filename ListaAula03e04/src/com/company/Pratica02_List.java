package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pratica02_List {

    public static void main(String[] args) {

        List dados = new ArrayList();

        dados.add("Isabel");
        dados.add(5.6);
        dados.add("Ana");
        dados.add(2);
        dados.add(true);
        dados.add("Maysa");
        dados.add(false);
        dados.add("Leticia");
        dados.add(3.4);
        dados.add(8);

        for (Object dado: dados
        ) {
            System.out.println("O valor é: " + dado);
        }
    }
}
