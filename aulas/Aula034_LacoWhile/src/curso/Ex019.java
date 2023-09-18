package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(num != 0) {
			//base, expoente
			System.out.println(Math.pow(num, 2));
			System.out.print("Digite o próximo número: ");
			num = Integer.parseInt(sc.nextLine());			
		}
		
		System.out.println("Fim do programa");

	}

}
