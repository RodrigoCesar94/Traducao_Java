import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		double x1, x2, y1, y2, p1, p2, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de x(x1), do primeiro ponto: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y(y1), do primeiro ponto: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de x(x2), do segundo ponto: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y(y2), do segundo ponto: ");
		y2 = leia.nextDouble();
		
	
		
		p1 = Math.pow((x2-x1), 2.0);
	    p2 = Math.pow((y2-y1), 2.0);
	    d =  Math.sqrt((p1+p2));
	    
	    System.out.println("A distância entre os dois pontos é: "+d);
		
		
	}

}
