import java.util.Random;

public class ParesImpares {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];

        // Gerando 20 números aleatórios entre 1 e 100
        System.out.println("Números gerados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Gera números entre 1 e 100
            System.out.print(numeros[i] + " ");
        }

        // Arrays para armazenar pares e ímpares
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;

        // Separando os números em pares e ímpares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[contadorPares] = numero;
                contadorPares++;
            } else {
                impares[contadorImpares] = numero;
                contadorImpares++;
            }
        }

        // Exibindo os números pares
        System.out.println("\n\nNúmeros Pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }

        // Exibindo os números ímpares
        System.out.println("\n\nNúmeros Ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}