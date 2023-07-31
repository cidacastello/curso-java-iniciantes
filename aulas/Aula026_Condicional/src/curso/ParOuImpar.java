package curso;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		//config. do Locale
		Locale.setDefault(Locale.US);
		//obj. do tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		int valor;
		//entrada de dados
		System.out.print("Informe um valor: ");
		valor = Integer.parseInt(sc.nextLine());
		
		//verifica se o número é par ou ímpar
		if(valor % 2 == 0) {
			System.out.println(valor + " é par");
		}
		else {
			System.out.println(valor + " é ímpar");
		}
		
		
	}

}






