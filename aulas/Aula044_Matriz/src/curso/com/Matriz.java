package curso.com;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//declaração [linhas][colunas]
		double[][] notas = new double[5][10];
		
		char[][] letras = { {'a', 'b'}, {'c', 'd' } };
		
		int numeros[][] = new int[5][8];
		
		//preencher com números aleatórios		
		//linhas colunas
		for(int i = 0; i < numeros.length; i++) { //linha
			for(int j = 0; j < numeros[i].length; j++) { //coluna
				numeros[i][j] = 1 + random.nextInt(100);
			}			
		}
		
		//saída
		//percorrendo / iterando a matriz
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
				

	}

}











