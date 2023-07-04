package curso;

public class TextBlock {
	public static void main(String[] args) {
		String mensagem = """
				Olá Mundo do Java!
				Esté o novo recurso Text Block.
				Vamos ver como fica a nossa mensagem?
				""";
		System.out.println(mensagem);
		
		String str = "Java";
		int dia = 20;
		String mes = "Julho";
		double valor = 25.654;
		
		String saida = """
				Olá %s.
				Hoje é dia %d do mês de %s.
				O valor é R$ %.2f
				""".formatted(str, dia, mes, valor);
		System.out.println(saida);
	}

}







