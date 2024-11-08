package com.ifsp;

import java.util.Scanner;

public class aula5atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;

        while (true) {
            System.out.print("Digite uma frase (mínimo 15 caracteres): ");
            frase = scanner.nextLine();
            if (frase.length() >= 15) {
                break;
            }
            System.out.println("A frase deve ter pelo menos 15 caracteres. Tente novamente.");
        }

        int totalCaracteres = frase.length();
        int totalVogais = 0;
        int totalConsoantes = 0;

        for (int i = 0; i < totalCaracteres; i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (Character.isLetter(c)) { 
                if (isVowel(c)) {
                    totalVogais++;
                } else {
                    totalConsoantes++;
                }
            }
        }

        System.out.println("Quantidade total de caracteres: " + totalCaracteres);
        System.out.println("Quantidade de vogais: " + totalVogais);
        System.out.println("Quantidade de consoantes: " + totalConsoantes);

        scanner.close();
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}