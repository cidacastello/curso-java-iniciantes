package com.github.cidacastello.principal;

import com.github.cidacastello.modelo.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		//instanciar a classe ContaBancaria
		//criar o objeto tipo ContaBancaria
		ContaBancaria conta = new ContaBancaria();
		conta.nome = "Cida";
		conta.numeroDaconta = "123456-8";
		conta.agencia = "253-9";
		conta.saldo = 1000000.0;
		

	}

}
