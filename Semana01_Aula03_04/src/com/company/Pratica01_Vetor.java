package com.company;

public class Pratica01_Vetor {
    public static void main(String[] args) {
        String[] mes = {"Jan", "Fev", "Mar", "Abr",
                "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < tot.length; i++){
            System.out.printf("O mês de %s tem %d dias  \n", mes[i], tot[i]);
        }
    }
}
