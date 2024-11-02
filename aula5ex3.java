package com.ifsp;
import java.util.Scanner;

public class Exerciciotres {
	public static Scanner scanner = new Scanner(System.in, "UTF-8");
	public static void main(String[] args) {
		int [] numeros = new int[30];
		
		System.out.println("Entre com os 30 Números: ");
		for(int i =0; i <numeros.length; i++) {
			numeros[i] = scanner.nextInt();
			System.out.print(" ");
		}
				
		
		
	}

}
