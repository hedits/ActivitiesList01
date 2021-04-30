package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pratica03_ListString {
    public static void main(String[] args) {
        int sair = 0;
        List<String> names = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        do {
            System.out.printf("%d Informe o nome: ", sair + 1);
            String n = scan.next();
            names.add(n);
            sair++;
        }while (sair != 5);

        Collections.reverse(names);

        for (String name: names
        ) {
            System.out.println(name);
        }
    }
}
