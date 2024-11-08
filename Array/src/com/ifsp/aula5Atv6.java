package com.ifsp;

public class aula5Atv6 {
    public static void main(String[] args) {
        String str1 = new String("exemplo");
        String str2 = new String("exemplo");

        boolean conteudoIguais = str1.equals(str2);
        System.out.println("Comparando conteúdo com equals(): " + conteudoIguais);

        boolean enderecosIguais = (str1 == str2);
        System.out.println("Comparando endereços com ==: " + enderecosIguais);

        String str3 = "exemplo";
        String str4 = "exemplo";

        boolean conteudoIguaisLiterais = str3.equals(str4);
        System.out.println("Comparando conteúdo de literais com equals(): " + conteudoIguaisLiterais);

        boolean enderecosIguaisLiterais = (str3 == str4);
        System.out.println("Comparando endereços de literais com ==: " + enderecosIguaisLiterais);
    }
}