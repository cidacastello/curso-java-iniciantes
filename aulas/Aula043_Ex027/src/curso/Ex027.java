package curso;

import java.util.Arrays;
import java.util.Random;

public class Ex027 {

	public static void main(String[] args) {

		int[] array = new int[50];
		Random random = new Random();

		int par = 0, impar = 0;
		int indicePar = 0, indiceImpar = 0;

		// gerar o array com os número aleatórios
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + random.nextInt(100);
			if (array[i] % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}

		// arrays par - ímpar
		int[] arrayPar = new int[par];
		int[] arrayImpar = new int[impar];

		// percorrer o array e preencher arrays par e ímpar

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayPar[indicePar] = array[i];
				indicePar += 1;
			} else {
				arrayImpar[indiceImpar] = array[i];
				indiceImpar += 1;
			}
		}

		// saída dos 3 vetores
		System.out.println("\nArray\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("\nPar\n");
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.println(arrayPar[i]);
		}

		System.out.println("\nÍmpar\n");
		for (int i = 0; i < arrayImpar.length; i++) {
			System.out.println(arrayImpar[i]);
		}
		
		// Ordenação dos valores dos vetores
		// Classe Arrays - método sort
		Arrays.sort(arrayPar);
		Arrays.sort(arrayImpar);
		
		System.out.println("\nOrdenados\n");
		System.out.println("\nPar\n");
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.println(arrayPar[i]);
		}

		System.out.println("\nÍmpar\n");
		for (int i = 0; i < arrayImpar.length; i++) {
			System.out.println(arrayImpar[i]);
		}

	}
}
