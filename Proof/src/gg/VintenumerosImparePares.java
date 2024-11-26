package gg;
import java.util.Scanner;
import java.util.ArrayList;

public class VintenumerosImparePares {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 ArrayList<Integer> impares = new ArrayList<>();
	 ArrayList<Integer> pares = new ArrayList<>();
	 System.out.println("Digite 20 números inteiros:\n");
	 for (int i = 0; i < 20; i++) {
	 System.out.print("Número " + (i + 1) + ": ");
	 int numero = scanner.nextInt();
	 if (numero % 2 == 0) {
	 pares.add(numero);
	 } else {
	 impares.add(numero);
	 }
	 }
	 System.out.println("\nNúmeros ímpares:");
	 for (int num : impares) {
	 System.out.println(num);
	 }
	 System.out.println("\nNúmeros pares:");
	 for (int num : pares) {
	 System.out.println(num);
	 }
	 scanner.close();
	 }
	}
