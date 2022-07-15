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
		System.out.println("2 - Diagn�stico");
		System.out.println("0 - Para sair");
		System.out.print("Digite uma op��o v�lida: ");
		this.opcao = entrada.nextInt();
		System.out.println();
		return this.opcao;
	}
}
