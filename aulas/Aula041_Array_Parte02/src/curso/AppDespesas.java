package curso;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppDespesas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] despesas = new double[4];

		// entrada
		for (int i = 0; i < despesas.length; i++) {
			
			despesas[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa R$"));
		}

		double valorTotal=0;
		// saída
		for (double desp : despesas) {
			valorTotal += desp;
			System.out.println("R$ " + desp);
		}
		
		//saída
		JOptionPane.showMessageDialog(null, "Valor total das despesas: R$ " + valorTotal);

	}

}
