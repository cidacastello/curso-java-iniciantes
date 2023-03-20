package curso;

import java.util.Scanner;

public class Ex01StringEntradaDeDados {

	public static void main(String[] args) {
		
		//declaração de variáveis do tipo String
		String nome;
		String sobrenome;
		//entrada de dados - Scanner
		//declaração do objeto
		Scanner teclado;
		//construir o objeto
		teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		//recebe a entrada de dados
		nome = teclado.next();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = teclado.next();
		
		//saída
		System.out.println(nome + " " + sobrenome);

	}

}
