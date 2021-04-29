package com.company;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso: ");
        double peso = scan.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);


    }
}
