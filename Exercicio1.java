import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos, meses, dias, total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade completa, começando pelos anos: ");
		anos = leia.nextInt();
		
		System.out.println("meses: ");
		meses = leia.nextInt();
		
		System.out.println("dias: ");
		dias = leia.nextInt();
		
		total = anos*365 + meses*30 + dias;
		System.out.println("Sua idade em dias é: "+ total);
	

	}

}
