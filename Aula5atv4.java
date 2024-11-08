package com.ifsp;

import java.util.Scanner;

public class Aula5atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1 = "";
        String palavra2 = "";

        while (true) {
            System.out.print("Digite a primeira palavra (mínimo 5 letras): ");
            palavra1 = scanner.nextLine();
            if (palavra1.length() >= 5) {
                break;
            }
            System.out.println("A palavra deve ter pelo menos 5 letras. Tente novamente.");
        }

        while (true) {
            System.out.print("Digite a segunda palavra (mínimo 5 letras): ");
            palavra2 = scanner.nextLine();
            if (palavra2.length() >= 5) {
                break;
            }
            System.out.println("A palavra deve ter pelo menos 5 letras. Tente novamente.");
        }

        if (isPalindrome(palavra1, palavra2)) {
            System.out.println("As palavras formam um par de palíndromas: " + palavra1 + " e " + palavra2);
        } else {
            System.out.println("As palavras não formam um par de palíndromas.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String p1, String p2) {
        return p1.equals(new StringBuilder(p2).reverse().toString());
    }
}