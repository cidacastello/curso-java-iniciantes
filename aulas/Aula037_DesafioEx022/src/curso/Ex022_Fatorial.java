package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex022_Fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial, i = 1;
		
		fatorial = 1;
		
		System.out.print("Digite o valor ");
		n = Integer.parseInt(sc.nextLine());
		
		do {
			fatorial = fatorial * i;
			i++;
			
		}while(i <= n);
		
		System.out.println("Fatorial = " + fatorial);
		sc.close();

	}

}
