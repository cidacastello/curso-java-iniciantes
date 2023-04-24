package curso;

import java.util.Scanner;
public class Exercicio05 {
	
	public static void main(String[] args) {
		//declarar variáveis
		//criar objeto sc Scanner
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma, subtracao;
		int multiplicacao, divisao, resto;
		//entrada de dados
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		//processamento
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		resto = num1 % num2;
		
		//saída		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Multiplicação = " + multiplicacao);
		System.out.println("Divisão = " + divisao);
		System.out.println("Resto da divisão = " + resto);
	}

}







