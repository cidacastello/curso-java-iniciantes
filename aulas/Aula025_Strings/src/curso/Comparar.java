package curso;

public class Comparar {
	
	public static void main(String[] args) {
		
		/* == para tipos primitivos
		 * int num1 = 2, num2 = 2; 
		 * System.out.println(num1 == num2);
		 */
		// == se aponta para o mesmo objeto
		// equals compara o conteúdo do objeto
		String nome1 = new String("Java");
		String nome2 = new String("Java");
		System.out.println("== " + (nome1 == nome2));
		System.out.println("equals " + nome1.equals(nome2));		
	}

}




