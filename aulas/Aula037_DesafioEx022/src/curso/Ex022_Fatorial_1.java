package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex022_Fatorial_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial;
		
		fatorial = 1;
		
		System.out.print("Digite o valor ");
		n = Integer.parseInt(sc.nextLine());
		
		if(n == 0) {
			fatorial = 1;
		}else {
			
			do {
				fatorial = fatorial * n;
				n--;				
			}while(n > 0);
			
		}
		
		System.out.println("Fatorial = " + fatorial);
		sc.close();

	}

}






