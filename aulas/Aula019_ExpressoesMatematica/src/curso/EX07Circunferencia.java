package curso;

import java.util.Locale;
import java.util.Scanner;

public class EX07Circunferencia {
	
	public static void main(String[] args) {
		//Obj Scanner - ler a entrada de dados
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		//Constante PI
		// final double PI = 3.14159;
		
		double area, comprimento, raio;
		
		System.out.print("Valor do raio? ");
		raio = entrada.nextDouble();
		area = Math.PI * Math.pow(raio, 2) ;
		comprimento = 2 * Math.PI * raio;
		
		//saída
		System.out.println("Área = " + area);
		System.out.println("Comprimento = " + comprimento);
		
	}

}





