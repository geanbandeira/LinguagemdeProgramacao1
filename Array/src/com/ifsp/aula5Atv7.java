package com.ifsp;
import java.util.Arrays;

public class aula5Atv7 {
    public static void main(String[] args) {
        int[] pontuacoes = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        System.out.println("Pontuações originais: " + Arrays.toString(pontuacoes));

        int soma = 0;
        for (int pontuacao : pontuacoes) {
            soma += pontuacao;
        }

        double media = (double) soma / pontuacoes.length;

        System.out.printf("Média das pontuações: %.2f%n", media);
    }
}
