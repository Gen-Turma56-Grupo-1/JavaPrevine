package br.com.generation.projeto;

import java.util.Scanner;

public class MenuPrincipal {
	
	private Scanner entrada;
	private int opcao;
	
	public MenuPrincipal(Scanner entrada) {
		 this.entrada = entrada;
	}
	
	public int menuPrincipal(){

		System.out.println(" ________________________________________");
		System.out.println("| 		       JAVA PREVINE		     	 |");
		System.out.println("|  					                     |");
		System.out.println("| 		1. Calculadora Covid	         |");
		System.out.println("|       2. Diagnostico		             |");
		System.out.println("|       0. Para sair		             |");
		System.out.println("|________________________________________|");
		System.out.print(" Digite uma opção válida: ");
		this.opcao = entrada.nextInt();
		System.out.println();
		return this.opcao;
	}
}
