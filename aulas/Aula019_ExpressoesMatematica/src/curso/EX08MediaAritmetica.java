package curso;

import java.util.Locale;
import java.util.Scanner;

public class EX08MediaAritmetica {
	
	public static void main(String[] args) {
		//Obj Scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double nota1, nota2, media;
		
		//entrada de dados
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		
		//calcular a média
		media = (nota1 + nota2) / 2 ;
		
		System.out.println("Média = " + media);
		
		
	}

}




