package gg;
import java.util.Scanner;

public class Ler2Strings {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite a primeira string: ");
		 String primeiraString = scanner.nextLine();
		 System.out.print("Digite a segunda string: ");
		 String segundaString = scanner.nextLine();
		 if (primeiraString.equalsIgnoreCase(segundaString)) {
		 System.out.println("As strings são iguais");
		 } else {
		 System.out.println("As strings são diferentes");
		 }
		 scanner.close();
	}
}