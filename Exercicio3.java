import java.util.Scanner;

public class Exercicio3 {/*Opera��o de uma m�quina obtida em segundos e 
	entregue em horas minutos e segundos.*/

	public static void main(String[] args) {
		
		
		int segundos1, segundos2, horas, minutos;
		/*vari�veis declaradas como inteiro para que haja resto de divis�o, 
        sendo segundos1 o numero de dias que a pessoa vai colocar e segundos 2 o 
        adicional final em segundos ap�s o processamentos das horas em minutos. */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o tempo de opera��o em segundos: ");
		segundos1 = leia.nextInt();
		
		horas = segundos1/3600;        //divis�o 
		minutos = segundos1%3600 /60; //RestoDivis�o e divis�o por 60 
		segundos2 = segundos1%3600 %60; //Resto Divis�o, e resto divis�o 
		
		System.out.println("Voc� operou: " +horas+" hora(s) "+minutos+" minuto(s) "+segundos2+" segundo(s) ");	
     	
		leia.close();
	}

}
