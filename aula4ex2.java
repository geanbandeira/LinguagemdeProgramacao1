import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (isPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
    
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se o número for divisível por i, não é primo
            }
        }
        
        return true; // Se não encontrou divisores, é primo
    }
}
