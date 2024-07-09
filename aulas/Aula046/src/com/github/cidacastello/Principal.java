//pacote
package com.github.cidacastello;

// imports
import com.github.cidacastello.modelo.Carro;

public class Principal {

	public static void main(String[] args) {
		
		//System.out.println("Hello, minha primeira classe!");
		// criando objeto do tipo Carro
		// tipo - nome = new construtor da classe
		Carro carro = new Carro();
		carro.marca = "VW";
		carro.modelo = "Nivus";
		carro.anoFrabricacao = 2024;
		carro.cor = "Cinza";
		carro.preco = 119900.0;		
		
		//segundo objeto do tipo
		Carro carro2 = new Carro();
		carro.marca="Chevrolet";
		carro2.modelo = "Onix";
		carro2.preco = 72500.0;
		carro2.cor = "Prata";
		carro2.anoFrabricacao = 2023;
		
		//carro
		System.out.println("Carro - Marca: " + carro.marca);
		
		//carro2
		System.out.println("Carro2 - Marca: " + carro2.marca);
		

	}

}







