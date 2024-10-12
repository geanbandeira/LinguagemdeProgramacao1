import java.util.Scanner;

public class Par {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		
		System.out.println("Entre com o mês correspondente: (mm) \n");
		String mes = scanner.nextLine();
		
		System.out.println("\nEntre o seu consumo mensal de água: \n");
		Double consumo = scanner.nextDouble();
		
		if(consumo < 10) {
			System.out.println("Total: R$ 5,00.\n");
		}else if(consumo < 15){
			System.out.println("Total: R$ 8,00.\n");
		}else {
			System.out.println("Total: R$ 15,00.\n");
		}
	}
}
