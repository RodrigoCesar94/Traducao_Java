import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double custo, custof, distribuidor=0.28, imposto=0.45;
		Scanner leia = new Scanner(System.in);
				
				System.out.println("Insira o custo de fábrica: ");
				custo = leia.nextDouble();
				
				custof = (custo*distribuidor)+(custo*imposto)+custo;
		          
			    System.out.println("Custo final ao consumidor é: "+custof);
	}

}
