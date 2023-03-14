package curso;

/**
 * Programa para conversão de dados
 * Explícitamente
 * @author Cida
 *
 */
public class ConversaoExplicita {
	
	public static void main(String[] args) {
		//do maior para o menor tipo
		
		long varLong = 9000000000000L;
		int varInt = (int) varLong;
		System.out.println("Long: " + varLong);
		System.out.println("Int : " +  varInt);
		
		double varDouble = 3654.9875;
		int varInt2 = (int) varDouble;
		System.out.println("Double para int: " + varInt2);
		
		float varFloat = (float) varDouble;
		System.out.println("Double para float: " + varFloat);
	}

}
