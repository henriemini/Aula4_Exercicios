package br.fai.ex01;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Main app = new Main();
		System.out.printf("Qual exercicio?\n");
		int exercicio = ler.nextInt();
		if (exercicio == 1) app.start1();
		else if (exercicio == 2) app.start2();
		else if (exercicio == 3) app.start3();
		else if (exercicio == 4) app.start4();
		else if (exercicio == 5) app.start5();
		else if (exercicio == 6) app.start6();
		else if (exercicio == 7) app.start7();

	}

	private void start1 () {
		int idade = 15;
		System.out.printf("A idade eh de %d anos. \n", idade);
		idade+=5;
		idade*=2;
		System.out.printf("Resultado 1: %d.\n", idade);
		idade-=5;
		System.out.printf("Resultado 2: %d. \n", idade);
		if (idade>20) {
			System.out.printf("Idade maior que 20. \n");
		}
		else System.out.printf("Idade maior que 20. \n	");
	}

	private void start2() {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Entre com o numero desejado: ");
		double produto = ler.nextDouble();
		int produtoInt = (int) produto;
		System.out.printf("Valor com casas decimais: %f | Valor inteiro: %d \n" , produto, produtoInt);
		
		int novoValor = 10;
		double DoubleImplicito = novoValor;
	    System.out.printf("Novo: %d \n Convertido %f", novoValor,DoubleImplicito);
	}

	private void start3() {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Qual Idade?\n");
		int idade = ler.nextInt();
		if (idade > 20) System.out.printf("Idade maior que 20.");
		else if (idade > 17 && idade < 12) System.out.printf("Idade maior que 12 e menor que 17.");
		else if (idade == 7 || idade < 5) System.out.printf("Idade igual a 7 OU menor que 5.");
		else System.out.printf("Outras combina��es.");
	}

	private void start4() {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 20;
		
		while (n-- != 0) i++;
		n = 20;
		
		do {
			j++;
		}while(n-- != 1);
		
		for (int aux = 20; aux!=0; aux--)k++;
		
		System.out.printf("Valor i: %d. \n\n Valor j: %d. \n\n Valor k: %d.", i,j,k);
	}

	private void start5() {
		
		for(int N = 0; N<6 ;N++) {
		switch (N) {
		  case 1:
		    System.out.printf("Primeira Condi��o.\n");
		    break;
		  case 4:
			    System.out.printf("Segunda Condi��o.\n");
		    break;
		  default:
			    System.out.printf("N�o encontrou Condi��o.\n");
		}
		}
	}

	private void start6() {
		Scanner ler = new Scanner(System.in);
		String[] MeuArray = new String[10];
		MeuArray[0] = "civic";
		MeuArray[1] = "gol";
		MeuArray[2] = "palio";
		MeuArray[3] = "uno";
		int n = 0;
		while (n<5) 
			{
			System.out.printf("%s\n\n", MeuArray[n]);
			n++;
			}
		
	}
	private void start7() {
		Scanner ler = new Scanner(System.in);
		
	}
}
