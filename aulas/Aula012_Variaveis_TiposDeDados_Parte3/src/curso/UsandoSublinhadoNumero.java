package curso;
/**
 * Usando sublinhado em números
 * @author lucit
 *
 */
public class UsandoSublinhadoNumero {
	
	public static void main(String[] args) {
		
		long numeroCartaoDeCredito = 1234_5678_9012_3456L;
		System.out.println("Numero cartão " + numeroCartaoDeCredito);
		//inválido
		//float pi = 3_.1415F; 
		//float pi = 3._1415F;
		//long numeroCartaoDeCredito2 = 1234_5678_9012_3456_L;
		
		//válidos
		//int varInt = 5_2;
		
		//inválido
		//int varInt = 52_;
		
		
	}

}
