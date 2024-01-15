package curso;

import javax.swing.JOptionPane;

public class AppFibonacci {

	public static void main(String[] args) {
		
		int termos; //quantidade de termos da seq. Fibonacci
		
		termos = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos da sequência"));
		
		int a = 0, b = 1, c;
		int cont; //contador
		
		System.out.println(a);
		System.out.println(b);
		// próximo -> c = a + b
		for(cont = 3; cont <= termos; cont++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;			
		}

	}

}




