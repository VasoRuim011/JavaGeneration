//exercicio 1


package exerciciosJava;

import java.util.Scanner;

public class exercicioCondicional {

	public static void main(String[] args) {
		int opcao,vl1,vl2,vl3,vl4,vl5,vl6;
		Scanner leia= new Scanner(System.in);
		
		System.out.println("BEM VINDO A LANCHONETE DO PROGRAMADOR, QUAL É O SEU PEDIDO?\n");
		
		System.out.println("\n1 - Cachorro quente - R$10,00");
		System.out.println("\n2 - X-SALADA - R$15,00");
		System.out.println("\n3 - X-BACON - R$18,00");
		System.out.println("\n4 - BAURU - R$12,00");
		System.out.println("\n5 - REFRIGERANTE - R$8,00");
		System.out.println("\n6 - SUCO DE LARANJA - R$13,00");
		System.out.println("\nESCOLHA UMA OPÇÃO(DIGITE SOMENTO O n°)");
		
		opcao=leia.nextInt();
		
		
		switch(opcao) {
		case 1:
			System.out.println("\nQuantidade? ");
			vl1=leia.nextInt();
			System.out.println(vl1*10.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;		
		case 2:
			System.out.println("\nQuantidade? ");
			vl2=leia.nextInt();
			System.out.println(vl2*15.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;
		case 3:
			System.out.println("\nQuantidade? ");
			vl3=leia.nextInt();
			System.out.println(vl3*18.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;
		case 4:
			System.out.println("\nQuantidade? ");
			vl4=leia.nextInt();
			System.out.println(vl4*12.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;
		case 5:
			System.out.println("\nQuantidade? ");
			vl5=leia.nextInt();
			System.out.println(vl5*8.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;
		case 6:
			System.out.println("\nQuantidade? ");
			vl6=leia.nextInt();
			System.out.println(vl6*13.00);
			System.out.println("\nOBRIGADO, VOLTE SEMPRE!");
			break;
			default:
			System.out.println("\nOpção Inválida!!!");	
		}
	}
}



//Exercício 2


package exerciciosJava;
import java.util.Scanner;

public class exercicioCondicional {

	public static void main(String[] args) {
		int idade;
		Scanner leia= new Scanner(System.in);
		
		System.out.printf("Digite sua idade");
		idade=leia.nextInt();
		leia.nextLine();
		
		if(idade>=16 && idade<18)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é facultativo");			
		}
		if(idade>=18 && idade<65)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é obrigatorio");
		}
		if(idade>=65)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é facultativo");
		}
		else
		{
			System.out.printf("\nVocê não está apto a votar");
		}
				
	}

}

