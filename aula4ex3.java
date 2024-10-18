import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();
        
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();
        
        System.out.print("Digite o número de termos: ");
        int numeroTermos = scanner.nextInt();
        
        System.out.println("Os termos da Progressão Aritmética são:");
        for (int i = 0; i < numeroTermos; i++) {
            int termo = primeiroTermo + i * razao;
            System.out.print(termo + " ");
        }
        
        scanner.close();
    }
}
