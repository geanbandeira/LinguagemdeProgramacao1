package com.ifsp;

import java.util.Scanner;

public class Aula5atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];
        int contador = 0;
        int soma = 0;

        System.out.println("Digite até 30 números (digite 0 para encerrar):");
        for (int i = 0; i < 30; i++) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break; 
            }
            numeros[i] = numero;
            soma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhum número foi lido.");
            extracted();
        }

        double media = (double) soma / contador;
        System.out.printf("A média dos números lidos é: %.2f%n", media);

        int contMaior = 0;
        int contIgual = 0;
        int contMenor = 0;

        for (int i = 0; i < contador; i++) {
            if (numeros[i] > media) {
                contMaior++;
            } else if (numeros[i] == media) {
                contIgual++;
            } else {
                contMenor++;
            }
        }

        System.out.println("Contagem dos números:");
        System.out.println("Maior que a média: " + contMaior);
        System.out.println("Igual à média: " + contIgual);
        System.out.println("Menor que a média: " + contMenor);

        scanner.close();
    }

	private static void extracted() {
	}
}