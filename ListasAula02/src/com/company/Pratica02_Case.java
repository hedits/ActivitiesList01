package com.company;

import java.util.Scanner;

public class Pratica02_Case {
    public static void main(String[] args) {
        double total = 0;

        Scanner scan = new Scanner(System.in);


        System.out.println("                        MENU");
        System.out.println("Item                    Código         Preço");
        System.out.print("Cachorro quente ------  100 ---------  R$ 1.20\n" +
                "Bauru simples   ------  101 ---------  R$ 1.30\n" +
                "Bauro com ovo   ------  102 ---------  R$ 1.50\n" +
                "Hambúguer       ------  103 ---------  R$ 1.20\n" +
                "Cheeseburguer   ------  104 ---------  R$ 1.30\n" +
                "Refrigerante    ------  105 ---------  R$ 1.00\n");

        System.out.println("Informe o código e a quantidade do seu pedido: ");
        int cod = scan.nextInt();
        int qtdd = scan.nextInt();

        switch (cod){
            case 100:
                total = qtdd * 1.20;
                System.out.println("Cod   Item               Qtdd      Total");
                System.out.println("------------------------------------------");
                System.out.printf("%d   Cachorro Quente      %d       R$ %.2f\n", cod, qtdd, total);

                break;
            case 101:
                total = qtdd * 1.30;
                System.out.println("Cod   Item              Qtdd      Total");
                System.out.println("------------------------------------------");
                System.out.printf("%d   Bauru simples      %d        R$ %.2f\n", cod, qtdd, total);

                break;
            case 102:
                total = qtdd * 1.50;
                System.out.println("Cod   Item              Qtdd     Total");
                System.out.println("-----------------------------------------");
                System.out.printf("%d   Bauro com ovo      %d       R$ %.2f\n", cod, qtdd, total);

                break;
            case 103:
                total = qtdd * 1.20;
                System.out.println("Cod   Item              Qtdd     Total");
                System.out.println("-----------------------------------------");
                System.out.printf("%d   Hambúguer      %d           R$ %.2f\n", cod, qtdd, total);

                break;
            case 104:
                total = qtdd * 1.30;
                System.out.println("Cod   Item              Qtdd     Total");
                System.out.println("-----------------------------------------");
                System.out.printf("%d   Cheeseburguer      %d       R$ %.2f\n", cod, qtdd, total);

                break;
            case 105:
                total = qtdd * 1.00;
                System.out.println("Cod   Item              Qtdd     Total");
                System.out.println("-----------------------------------------");
                System.out.printf("%d   Refrigerante      %d        R$ %.2f\n", cod, qtdd, total);

                break;
            default:
                System.out.println("Desculpe! Não temos esse item no momento :(\n " +
                        "Informe um código de item do nosso menu! :)");
        }
        System.out.println("\n************* Volte Sempre! **************");


    }
}
