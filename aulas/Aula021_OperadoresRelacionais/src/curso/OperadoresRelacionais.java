package curso;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		//declaração de variáveis
		int num1 = 7, num2 = 7;
		boolean resultado;
		
		//maior >
		resultado = num1 > num2;
		System.out.println("Maior: " + resultado);
		
		//maior ou igual >=
		resultado = num1 >= num2;
		System.out.println("Maior ou igual: " + resultado);
		
		//menor <
		resultado = num1 < num2;
		System.out.println("Menor: " + resultado);
		//menor ou igual <=
		resultado = num1 <= num2;
		System.out.println("Menor ou igual: " + resultado);
		
		//igual ==
		resultado = num1 == num2;
		System.out.println("Igualdade: " + resultado);
		
		//diferente !=
		resultado = num1 != num2;
		System.out.println("Diferente: " + resultado);
		
	}

}







