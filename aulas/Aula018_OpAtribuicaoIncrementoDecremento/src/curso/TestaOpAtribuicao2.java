package curso;

public class TestaOpAtribuicao2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		x = x / y + 5;
		System.out.println(x);
		x = 10;
		x /= y + 5;
		System.out.println(x);
		
	}

}
