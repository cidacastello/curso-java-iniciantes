package curso;

public class AppArray2 {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		vetor[0] = 35;
		vetor[1] = -8;
		vetor[2] = vetor[1] + 10;
		vetor[3] = vetor[0] * vetor[1];
		vetor[4] = 15/3;
		
		//iterar o vetor
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
		
		//foreach
		for (int valor : vetor) {
			System.out.println(valor);
		}

	}

}








