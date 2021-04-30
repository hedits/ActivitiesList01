package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**Tivemos dois dias com o mesmo conteúdo**/

public class Pratica05_Random {
    public static void main(String[] args) {
        int maiorNumber = 0;

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int n = 10 + random.nextInt(100 - 10);
            //System.out.printf("%d %d \n", i, n);
            numbers.add(n);
        }

        for (int num : numbers
        ) {
            if (num > maiorNumber) {
                maiorNumber = num;
            }
        }

        System.out.println("O maior é: " + maiorNumber);
    }
}
