package com.github.cidacastello.modelo;

public class ContaBancaria {
	
	private String nome;
	private String numeroDaConta;
	private String agencia;
	private double saldo;
	private boolean ativa;
	
	//get -> retorna valor
	public String getNome() {
		return nome;
	}
	
	//set -> recebe valor
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//boolean - get
	public boolean isAtiva() {
		return ativa;
	}
	//boolean - set
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	// nossos métodos
	
	public void depositar(double valor) {
		if(valor <= 0 ) {
			System.out.println("Valor para depósito inválido!");
			return;
		}
		
		if(!ativa) {
			System.out.println("Conta inativa");
			return;
		}
		
		saldo = saldo + valor;		
		
	}
	
	public void sacar(double valor) {
		
		if(valor <= 0 ) {
			System.out.println("Valor inválido!");
			return;
		}
		
		if(!ativa) {
			System.out.println("Conta inativa");
			return;
		}
		
		if(saldo < valor) {
			System.out.println("Saldo insuficiente");
			return;
		}
		
		saldo = saldo - valor;
		// saldo -= valor;
		
	}
	

	

}







