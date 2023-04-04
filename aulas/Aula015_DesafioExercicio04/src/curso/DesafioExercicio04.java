package curso;

import java.util.Scanner;

public class DesafioExercicio04 {
	
	public static void main(String[] args) {
		//declaração de variáveis
		
		Scanner sc = new Scanner(System.in);
		 int  num1, num2, soma;
		// ler 2 inteiros
		 System.out.print("Digite o primeiro número: ");
		 num1 = sc.nextInt();
		 System.out.print("Digite o segundo número: ");
		 num2 = sc.nextInt();
		
		//somar 
		 //soma = num1 + num2;
		
		//apresentar a soma
		// System.out.println("Soma = " + soma);
		 //outra forma
		 //System.out.println("Soma = " + num1 + num2); //62
		 System.out.println("Soma = " + (num1 + num2)); //62
		//System.out.println(num1 + num2);
		
		//sc.close();
		//num1 = sc.nextInt();
		
		
	}

}







