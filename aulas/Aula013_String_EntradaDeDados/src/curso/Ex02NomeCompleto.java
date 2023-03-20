package curso;

import java.util.Scanner;

public class Ex02NomeCompleto {
	
	public static void main(String[] args) {
		
		//objeto Scanner
		Scanner teclado = new Scanner(System.in);
		//variável do tipo String
		String nomeCompleto;
		
		System.out.print("Digite seu nome completo: ");
		nomeCompleto = teclado.nextLine();
		
		//saída
		System.out.println("Olá, " + nomeCompleto + " você está no curso de Java para Iniciantes");
	}

}
