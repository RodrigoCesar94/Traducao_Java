import java.util.Scanner;

//

public class Exercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		
		int anos, meses, dias1, dias2, mes=30, ano=365;
		/*variáveis declaradas como inteiro para que haja resto de divisão, 
        sendo dias1 o numero de dias que a pessoa vai colocar que viveu e dias2
         é o que sobra após o calculo dos meses e anos*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva quantos dias você viveu: ");
		dias1 = leia.nextInt();
		
		 anos = dias1/ano;      //divisão de dias1, informado pelo usuário por 365, para obter o numero de dias
		 meses = dias1%ano / mes; //Resto da divisão de dias1/ano em dias dividido por mês, sendo mês declarado com valor 30 na linha 5.
		 dias2 = dias1%ano % mes; //resto da divisão dos meses, obtido em dias. 
		 
		 System.out.println("Você viveu: "+anos+" anos "+meses+" meses e "+dias2+" dias");
		 		 
	}

}
