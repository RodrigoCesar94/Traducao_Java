import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de a");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de b");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de c");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de d");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de e");
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de f");
		f = leia.nextDouble();


		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));

		System.out.println("valor de x é "+x+" e o valor de y é: "+y);

	}

}
