package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica04_Name {

    public static void main(String[] args) {
        boolean c = true;
        List<String> names = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        names.add("Tainá");
        names.add("Stellinha");
        names.add("Tequillinha");
        names.add("Pituzinho");
        names.add("Edith");

        // Solução 1
        while (c == true){
            System.out.println("Esolha o nome que deseja remover");
            System.out.println("0-Tainá\n" + "1-Stellinha\n"+"2-Tequillinha\n" +
                    "3-Pituzinho\n" + "4-Edith");
            int n = scan.nextInt();

            //0, 1, 2, 3, 4
            if (n < names.size()){
                names.remove(n);
                c = false;
            }else {
                c = true;
            }
        }

        // Solução 2
        while (c == true){
            System.out.println("Esolha o nome que deseja remover");
            int count = 1;
            for (String nome: names) {
                System.out.printf("%d- %s \n", count, nome);
                count++;
            }

            int n = scan.nextInt();

            switch (n){
                case 1:
                    names.remove(0);
                    break;
                case 2:
                    names.remove(1);
                    break;
                case 3:
                    names.remove(2);
                    break;
                case 4:
                    names.remove(3);
                    break;
                case 5:
                    names.remove(4);
                    break;
                default:
                    System.out.println("Nome não cadastrado!\n");
                    continue;
            }
            c = false;
        }

        System.out.println("Nomes restantes na lista");
        for (String name: names
        ) {
            System.out.println(name);
        }
    }
}
