package com.github.cidacastello.modelo;

public class PessoaFisica {
	
	//modificador de acesso - tipo - nome
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private String email;

	
	//set
	// void - não retorna valor -> receber parâmetro -> configurar
	
	//métodos
//	modificador de acesso - tipo de retorno
	//nome do método - parâmetro
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	
	//get
	// retornar valor - get -> pegar
	
	//recuperar o nome
//	modificador de acesso - tipo de retorno
	//nome do método - parâmetro
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;		
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	

}







