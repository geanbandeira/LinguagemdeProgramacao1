package com.ifsp;

import java.util.Arrays;

public class aula5Atv9 {
    public static void main(String[] args) {
        int[] numeros = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        Arrays.sort(numeros);
        
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        int valorBuscado = 3;

        int indice = Arrays.binarySearch(numeros, valorBuscado);

        if (indice >= 0) {
            System.out.println("O valor " + valorBuscado + " foi encontrado no índice: " + indice);
        } else {
            System.out.println("O valor " + valorBuscado + " não foi encontrado.");
        }
    }
}