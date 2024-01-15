package curso;

import javax.swing.JOptionPane;

public class AppFibonacciVetor {

	public static void main(String[] args) {
		
		int tam = 2;
		
		tam = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos de Fibonacci"));
		int[] fibo = new int[tam];
		
		// índice
		fibo[0] = 0; // a
		fibo[1] = 1; // b		
		
		for(int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		
		//saída
		for (int i : fibo) {
			System.out.println(i);
		}
		
	}

}










