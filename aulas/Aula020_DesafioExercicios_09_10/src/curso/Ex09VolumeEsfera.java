package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex09VolumeEsfera {
	
	public static void main(String[] args) {
		//Obj Scanner
		Scanner sc = new Scanner(System.in);
		//setar Locale
		sc.useLocale(Locale.US);
		//declarar as variáveis
		double volume, raio;
		//entrada de dados
		System.out.print("Valor do raio: ");
		raio = sc.nextDouble();
		//System.out.println("4/3 = " + (4/3));
		//calcular o volume
		volume = 4.0/3.0 * Math.PI * Math.pow(raio, 3);
		//saída
		System.out.println("Volume da esfera  é " + volume);
		
	}

}







