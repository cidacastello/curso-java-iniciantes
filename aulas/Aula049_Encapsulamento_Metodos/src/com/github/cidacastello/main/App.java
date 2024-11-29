package com.github.cidacastello.main;

import com.github.cidacastello.modelo.PessoaFisica;

public class App {

	public static void main(String[] args) {
		//instanciando e criando o objeto
		PessoaFisica pf = new PessoaFisica();
		pf.guardarNome("Cida");
		
		String nomeRecebido = pf.recuperarNome();
		System.out.println("Nome: " + nomeRecebido);
		
		pf.guardarSobrenome("Castello");
		System.out.println("Sobrenome: " + pf.recuperarSobrenome() );
		
		pf.guardarCpf("123.456.789-00");
		System.out.println("CPF: " + pf.recuperarCpf());
		
		pf.guardarTelefone("9-6587-7898");
		pf.guardarEmail("cida@gmail.com");
		
		System.out.println("Telefone: " + pf.recuperarTelefone());
		System.out.println("E-mail: " + pf.recuperarEmail());


	}

}
