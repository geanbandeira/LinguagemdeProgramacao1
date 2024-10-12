import java.util.Scanner;

public class Par {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		
		System.out.println("Bem vindo Aluno\nEntre com a nota da 1° avaliação:\n");
		Double prova1 = scanner.nextDouble();
		System.out.println("\nEntre com a nota da 2° avaliação:\n");
		Double prova2 = scanner.nextDouble();
		System.out.println("\nEntre com a nota do projeto:\n");
		Double projeto = scanner.nextDouble();
		Double notaFinal = (prova1 *0.35 + prova2 *0.35 + projeto *0.30);
	
		System.out.println("\nTotal de aulas do bimestre:\n");
		int aulas = scanner.nextInt();
		
		Double aulasMinimo = (aulas *0.75);
		System.out.println("\nQuantas aulas foram frequentadas por você:\n");
		Double frequencia = scanner.nextDouble();
				
		if(aulasMinimo > frequencia) {
			System.out.println("\nAluno Reprovado por faltas\n");
		}else if(notaFinal > 6) {
			System.out.println("\nParabéns! Aluno Aprovado!\n");
		}else if(notaFinal > 4){
			System.out.println("\nAluno em Exame!\n");
		}else {
			System.out.println("\nAluno Reprovado por nota.\n");
		}
	}
}
