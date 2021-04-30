package com.company;

import java.util.Scanner;

public class Pratica04_DoWhile {

    public static void main(String[] args) {
        int numCalc;
        int num;
        double result;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Escolha a opção");
            System.out.print("1-Raiz Quadrada\n2-A Metade\n3-10% do número\n4-O dobro\n5-Sair");
            num = scan.nextInt();

            switch (num){
                case 1:
                    System.out.print("Raiz Quadrada\nNúmero:");
                    numCalc = scan.nextInt();
                    result =  Math.sqrt(numCalc);
                    System.out.printf("\nA Raiz Quadrada de %d é %.0f\n\n", numCalc, result);
                    break;
                case 2:
                    System.out.print("A Metade\nNúmero:");
                    numCalc = scan.nextInt();
                    result =  numCalc / 2;
                    System.out.printf("\nA Metade de %d é %.0f\n\n", numCalc, result);
                    break;
                case 3:
                    System.out.print("10% do número\nNúmero:");
                    numCalc = scan.nextInt();
                    result =  0.1 * numCalc;
                    System.out.printf("\n%%10 de %d é %.0f\n\n", numCalc, result);
                case 4:
                    System.out.print("O dobro\nNúmero:");
                    numCalc = scan.nextInt();
                    result =  num * 2;
                    System.out.printf("\nO dobro de %d é %.0f\n\n", numCalc, result);
                    break;
                default:
                    System.out.println("Informe um número de 1 a 4 ou 5 para sair\n");
            }
        }while (num != 5);
    }
}
