package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioEx020 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.print("Digite o primeiro número: ");
		int num = Integer.parseInt(sc.next());
		soma += num; // soma = soma + num
		
		while(num != 0) {
			System.out.print("Digite o próximo número: ");
			num = Integer.parseInt(sc.next());
			soma += num; // soma = soma + num
		}
		
		System.out.println("Total da soma = " + soma);

	}

}
