import java.util.Scanner;

public class Exercicio4 {/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de C: ");
		c = leia.nextDouble();
		
		r =  (double) Math.pow((a+b), 2.0); /*--> 144 utilizando a biblioteca matematica, ele sugere o cast para que, 
		se necess�rio, mesmo que aentrada seja fra��o, ele for�a a ser inteiro. */
		s =  (double) Math.pow((b+c), 2.0); // --> 25
		d = (r + s)/ 2 ;
		
		System.out.println("O resultado da express�o �: "+d);
		
		leia.close();

	}

}
