package curso;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
	/*
	ID: 52
	Nome: Smart TV 
	Descrição: Smart TV LED 43”
	Quantidade: 2
	Preço unitário: 1900,00
	Taxa de imposto: 15%
	 */
	
	public static void main(String[] args) {
		
		//Set Locale
		Locale.setDefault(Locale.US);
		//Objeto do tipo Scanner
		Scanner sc = new Scanner(System.in);
		//Variáveis
		int id;
		String nome, descricao;
		double quantidade, preco, taxa;
		double valorDoImposto, valorDoProduto, valorTotal;
		
		//entrada de dados
		System.out.print("Id: ");
		id = Integer.parseInt(sc.nextLine());
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Descrição: ");
		descricao = sc.nextLine();
		System.out.print("Quantidade: ");
		quantidade = Double.parseDouble(sc.nextLine());
		System.out.print("Preço unitário: ");
		preco = Double.parseDouble(sc.nextLine());
		System.out.print("Taxa do imposto %: ");
		taxa = Double.parseDouble(sc.nextLine());
		
		//processamento
		valorDoProduto = quantidade * preco;
		valorDoImposto = (valorDoProduto * taxa) / 100 ;
		valorTotal = valorDoImposto + valorDoProduto;
		
		//saída de dados
		System.out.println("Produto: Código " + id
				+ ", " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço unitário R$: " + preco);
		System.out.println("Preço Total R$: " + valorDoProduto);
		System.out.println("Valor do Imposto R$: " + valorDoImposto);
		System.out.println("Valor total da compra R$: " + valorTotal);
		
		
	}
	
	

}





