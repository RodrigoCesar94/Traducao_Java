import java.util.Scanner;

public class Exercicio3 {/*Operação de uma máquina obtida em segundos e 
	entregue em horas minutos e segundos.*/

	public static void main(String[] args) {
		
		
		int segundos1, segundos2, horas, minutos;
		/*variáveis declaradas como inteiro para que haja resto de divisão, 
        sendo segundos1 o numero de dias que a pessoa vai colocar e segundos 2 o 
        adicional final em segundos após o processamentos das horas em minutos. */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o tempo de operação em segundos: ");
		segundos1 = leia.nextInt();
		
		horas = segundos1/3600;        //divisão 
		minutos = segundos1%3600 /60; //RestoDivisão e divisão por 60 
		segundos2 = segundos1%3600 %60; //Resto Divisão, e resto divisão 
		
		System.out.println("Você operou: " +horas+" hora(s) "+minutos+" minuto(s) "+segundos2+" segundo(s) ");	
     	
		leia.close();
	}

}
