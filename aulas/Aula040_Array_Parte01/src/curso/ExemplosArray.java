package curso;

public class ExemplosArray {

	public static void main(String[] args) {

		// declarações de arrays
		int[] pontos;
		pontos = new int[5];

		// declaração em uma única linha
		int valores[] = new int[10];

		double[] notas = new double[5];
		double salarios[] = new double[5];
		// [índice] atribuir valores salarios
		salarios[0] = 3250.0;
		salarios[1] = 680.23;
		salarios[2] = 6200;
		salarios[3] = 7658.32;
		salarios[4] = 925.01;

		double[] despesas = { 3250, 680.23, 1528.32, 6982.65 };

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// para ler um vetor , percorrer o vetor
		// laço repetição
		for (int i = 0; i < 9; i++) {
			// apresentar todos os elementos do betor
			System.out.println(num[i]);
		}

		/*
		 * método length() é responsável por retornar o número de elementos alocados em
		 * um Array
		 */
		for (int i = 0; i < despesas.length; i++) {
			System.out.println(despesas[i]);
		}

		String[] nomes = new String[3];
		nomes[0] = "Maria";
		nomes[1] = "José";
		nomes[2] = "Anderson";
		// nomes[3] = "Paula"; exception

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
