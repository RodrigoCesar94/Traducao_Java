import java.util.Scanner;

public class Exercicio4 {/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
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
		se necessário, mesmo que aentrada seja fração, ele força a ser inteiro. */
		s =  (double) Math.pow((b+c), 2.0); // --> 25
		d = (r + s)/ 2 ;
		
		System.out.println("O resultado da expressão é: "+d);
		
		leia.close();

	}

}
