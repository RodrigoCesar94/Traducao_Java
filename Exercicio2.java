import java.util.Scanner;

//

public class Exercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		
		int anos, meses, dias1, dias2, mes=30, ano=365;
		/*vari�veis declaradas como inteiro para que haja resto de divis�o, 
        sendo dias1 o numero de dias que a pessoa vai colocar que viveu e dias2
         � o que sobra ap�s o calculo dos meses e anos*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva quantos dias voc� viveu: ");
		dias1 = leia.nextInt();
		
		 anos = dias1/ano;      //divis�o de dias1, informado pelo usu�rio por 365, para obter o numero de dias
		 meses = dias1%ano / mes; //Resto da divis�o de dias1/ano em dias dividido por m�s, sendo m�s declarado com valor 30 na linha 5.
		 dias2 = dias1%ano % mes; //resto da divis�o dos meses, obtido em dias. 
		 
		 System.out.println("Voc� viveu: "+anos+" anos "+meses+" meses e "+dias2+" dias");
		 		 
	}

}
