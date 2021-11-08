import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 Considerar que a média é  ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
		 
		double nota1, nota2, nota3, peso1=2, peso2=3, peso3=5, mediap;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Escreva a nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Escreva a nota 3: ");
		nota3 = leia.nextDouble();
		
		mediap=((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
		System.out.println("Nota final: "+mediap);
	}

}
