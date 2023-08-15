package curso;

public class CondicionalTernaria {
	
	public static void main(String[] args) {
		
		//condicional ternaria
		// if(condção) {
		//	verdadeira
		// }
		//else {
		//	falsa
		// }
		
		//variavel/print =  condição ? verdadeira : falsa
		
		int x = 9;
		
		System.out.println( (x % 2 == 0) ? "Par" : "Ímpar") ;
		
		int a = -80, b;		
		 b = a >= 0 ? 1 : -1;		 
		 System.out.println("Valor de b: " + b);
		 
		 double valor = 100;
		 double desconto;
		 
		 desconto = valor * (valor >= 150 ? 15.0/100 : 5.0/100);
		 System.out.println( String.format("Desconto de R$ %.2f" , desconto) );
		 
		 System.out.println( String.format("Valor a pagar R$ %.2f " , (valor - desconto)) );
		
			
		/*
		 * if(x % 2 == 0) { 
		 * System.out.println("Par"); } 
		 * else {
		 * System.out.println("Ímpar"); 
		 * }
		 */
		
	}

}
