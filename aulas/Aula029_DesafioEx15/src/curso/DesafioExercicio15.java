package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioExercicio15 {

	public static void main(String[] args) {
		// config. Locale
		Locale.setDefault(Locale.US);
		// obj Scanner
		Scanner sc = new Scanner(System.in);
		// variáveis
		double nota1, nota2, media;

		// entrada de dados
		System.out.print("Nota 1: ");
		nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Nota 2: ");
		nota2 = Double.parseDouble(sc.nextLine());

		// cálculo
		media = (nota1 + nota2) / 2;
		// \n -> escape, pular uma linha, enter

		if (media >= 9.0) {
			System.out.println(String.format("Média: %.2f\nConceito: A\nSituação: Aprovado(a)", media));
		} else if(media >= 8.0) {
			System.out.println(String.format("Média: %.2f\nConceito: B\nSituação: Aprovado(a)", media));
		} else if(media >= 7.0) {
			System.out.println(String.format("Média: %.2f\nConceito: C\nSituação: Aprovado(a)", media));
		} else if(media >= 6.0) {
			System.out.println(String.format("Média: %.2f\nConceito: D\nSituação: Recuperação", media));
		} else {
			System.out.println(String.format("Média: %.2f\nConceito: E\nSituação: Reprovado(a)", media));
		}
	}

}










