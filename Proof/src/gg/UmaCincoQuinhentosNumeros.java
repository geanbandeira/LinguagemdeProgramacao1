package gg;
import java.util.Random;

public class UmaCincoQuinhentosNumeros {

	public static void main(String[] args) {
		 Random random = new Random();
		 int[] contagem = new int[5];
		 for (int i = 0; i < 500; i++) {
		 int numeroAleatorio = random.nextInt(5) + 1;
		 contagem[numeroAleatorio - 1]++;
		 }
		 System.out.println("Proporção dos números gerados entre 1 e 5:\n");
		 for (int i = 0; i < contagem.length; i++) {
		 double proporcao = (double) contagem[i] / 500;
		 System.out.printf("Número %d: %d vezes (%.2f%%)\n", (i + 1), contagem[i],
		proporcao * 100);
		 }
		 }
		}



