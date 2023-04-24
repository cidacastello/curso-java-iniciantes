package curso;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio06 {
	
	public static void main(String[] args) {
		//declarar variáveis
		//criar objeto sc Scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double num1, num2, soma, subtracao;
		double multiplicacao, divisao;
		//entrada de dados
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		//processamento
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;		
		
		//saída		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Multiplicação = " + multiplicacao);
		System.out.println("Divisão = " + divisao);
	}

}







