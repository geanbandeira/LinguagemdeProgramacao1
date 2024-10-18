import java.util.Random;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Random random = new Random();
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = random.nextInt(10) + 1; 
            if (numeroAleatorio % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
