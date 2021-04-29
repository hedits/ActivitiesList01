package com.company;

import java.util.Scanner;

public class Pratica03_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o número: ");
        int numUser = scan.nextInt();
        System.out.println("Informe o número inicial e final da busca: ");
        int numInitial = scan.nextInt();
        int numFinal = scan.nextInt();

        for (int i = numInitial; i < numFinal; i++) {
            if (i % numUser == 0) {
                System.out.printf("Achei um número divisível por %d entre %d e %d\n",
                        numUser, numInitial, numFinal);
                System.out.println("O número é: " + i);
                break;
            }
        }


    }
}
