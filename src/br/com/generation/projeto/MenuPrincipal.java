package br.com.generation.projeto;

import java.util.Scanner;

public class MenuPrincipal {
	
	private Scanner entrada;
	private int opcao;
	
	public MenuPrincipal(Scanner entrada) {
		 this.entrada = entrada;
	}
	
	public int menuPrincipal(){
		
		System.out.println("MENU - SISTEMA");

		System.out.println("1 - Calculadora Covid");
		System.out.println("2 - Diagnóstico");
		System.out.println("0 - Para sair");
		System.out.print("Digite uma opção válida: ");
		this.opcao = entrada.nextInt();
		
		return this.opcao;
	}
}
