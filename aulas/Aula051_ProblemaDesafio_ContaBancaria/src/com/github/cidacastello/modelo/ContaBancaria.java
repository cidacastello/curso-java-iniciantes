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
	

}
