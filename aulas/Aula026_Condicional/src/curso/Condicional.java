package curso;

import java.util.Locale;

public class Condicional {

	public static void main(String[] args) {
		// config. do Locale
		Locale.setDefault(Locale.US);

		int idade = 11;

		// condicional simples
		// se -> if

		if (idade != 10) {
			System.out.println("Idade igual a 10");
		}

		// condicional composta
		// se - senão -> if - else

		if (idade == 10) {
			System.out.println("Idade igual a 10");
		} else {
			System.out.println("Idade não é igual a 10");
		}

		// continuação do código depois do if
		System.out.println("Depois da condicional");
	}

}
