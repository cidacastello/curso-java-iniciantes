package curso;

public class AppIfEncadeado {

	public static void main(String[] args) {
		
		int dia = 7;

		if (dia == 1) {
			System.out.println("Segunda-feira");
		} else if (dia == 2) {
			System.out.println("Terça-feira");
		} else if (dia == 3) {
			System.out.println("Quarta-feira");
		} else if (dia == 4)
			System.out.println("Quinta-feira");

		else if (dia == 5)
			System.out.println("Sexta-feira");

		else if (dia == 6)
			System.out.println("Sábado");

		else if (dia == 7)
			System.out.println("Domingo");

		else
			System.out.println("Dia Inválido");
	}

}
