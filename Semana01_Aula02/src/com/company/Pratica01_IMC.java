package com.company;

import java.util.Scanner;

public class Pratica01_IMC {
    // ctrl + TAB
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso e altura: ");
        float peso = scan.nextFloat();
        float altura = scan.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Seu índece de massa corporia é: " + imc);

        if (imc < 19.1){
            System.out.printf("IMC: %.2f - Abaixo do peso..", imc);
        }else if(imc > 19.1 && imc < 25.8){
            System.out.printf("IMC: %.2f - No peso normal...", imc);
        }else if (imc > 25.8 && imc < 27.3){
            System.out.printf("IMC: %.2f - Marginalmente acima do peso...", imc);
        }else if (imc > 27.3 && imc < 32.3){
            System.out.printf("IMC: %.2f - Acima do peso ideal...", imc);
        }else{
            System.out.printf("IMC: %.2f - Obeso...", imc);
        }
    }
}
