package com.github.cidacastello.main;

import com.github.cidacastello.modelo.PessoaFisica;

public class App {

	public static void main(String[] args) {
		//instanciando e criando o objeto
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Cida");
		
		String nomeRecebido = pf.getNome();
		System.out.println("Nome: " + nomeRecebido);
		
		pf.setSobrenome("Castello");
		System.out.println("Sobrenome: " + pf.getSobrenome() );
		
		pf.setCpf("123.456.789-00");
		System.out.println("CPF: " + pf.getCpf());
		
		pf.setTelefone("9-6587-7898");
		pf.setEmail("cida@gmail.com");
		
		System.out.println("Telefone: " + pf.getTelefone());
		System.out.println("E-mail: " + pf.getEmail());


	}

}
