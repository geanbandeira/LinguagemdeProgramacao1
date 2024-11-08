package com.ifsp;
import java.util.Arrays;

public class Aulaatv8 {
    public static void main(String[] args) {
        int[] numeros = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        System.out.println("Array original: " + Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}