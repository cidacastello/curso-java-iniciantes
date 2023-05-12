package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex10AreaDoTrapezio {
	
	public static void main(String[] args) {
		//Obj Scanner
		Scanner sc = new Scanner(System.in);
		//config. Locale
		sc.useLocale(Locale.US);
		//variáveis		
		double area, baseMaior, baseMenor , altura;
		//entrada
		System.out.print("Valor da base maior: ");
		baseMaior = sc.nextDouble();
		System.out.print("Valor da base menor: ");
		baseMenor = sc.nextDouble();
		System.out.print("Valor da altura: ");
		altura = sc.nextDouble();
		
		//calcular a área
		area = ( (baseMaior + baseMenor) / 2 ) * altura;
		
		//saída
		System.out.println("Área do trapézio é " + area);
	}

}


