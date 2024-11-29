package com.github.cidacastello.modelo;

public class PessoaFisica {
	
	//modificador de acesso - tipo - nome
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private String email;
	
	//métodos
//	modificador de acesso - tipo de retorno
	//nome do método - parâmetro
	public void guardarNome(String nome) {
		this.nome = nome;		
	}
	
	//recuperar o nome
//	modificador de acesso - tipo de retorno
	//nome do método - parâmetro
	public String recuperarNome() {
		return nome;
	}
	
	public void guardarSobrenome(String sobrenome){
		this.sobrenome = sobrenome;		
	}
	
	public String recuperarSobrenome() {
		return sobrenome;
	}
	
	public void guardarCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String recuperarCpf() {
		return cpf;
	}
	
	public void guardarTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String recuperarTelefone() {
		return telefone;
	}
	
	public void guardarEmail(String email) {
		this.email = email;
	}
	
	public String recuperarEmail() {
		return email;
	}
	
	

}







