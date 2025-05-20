package com.github.cidacastello.main;

import com.github.cidacastello.modelo.ContaBancaria;

public class App {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		//- setters - setar os valores
		conta.setNome("Cida Castello");
		conta.setNumeroDaConta("12365-a");
		conta.setAgencia("Central");
		conta.setSaldo(2500);
		conta.setAtiva(true);
		
		//pegar os valores - getters
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Numero da conta: " + conta.getNumeroDaConta());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Ativa? " + conta.isAtiva());
		
		// depositando valor na conta
		conta.depositar(1000);
		System.out.println("Novo Saldo: " + conta.getSaldo());
		
	}
	
	
	
	
	
	
	
	
	

}
