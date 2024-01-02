package curso;

import javax.swing.JOptionPane;

public class Ex_027 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int media = 0;
		
		//entrada de dados
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor? "));
			media += num[i];
		}
		
		//saída
		for(int i : num) {
			System.out.println("Valor: " + i);
		}
		
		//média
		media = media / 5;
		JOptionPane.showMessageDialog(null, "Média = " + media);

	}

}
