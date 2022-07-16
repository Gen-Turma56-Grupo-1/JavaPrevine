package br.com.generation.projeto;

import java.util.Scanner;

public class MenuPrincipal {
	
	private Scanner entrada;
	private int opcao;
	
	public MenuPrincipal(Scanner entrada) {
		 this.entrada = entrada;
	}
	
	public void introducao() throws InterruptedException {
		

		
		for(int x = 0; x < 10; x++) {
			Thread.sleep(130);
			System.out.print(".");
		}
		System.out.println();
		
		for(int x = 0; x < 65; x++) {
			Thread.sleep(9);
			System.out.print("_");
		}

		
		System.out.println("\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+"    ####\r\n"
				+"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "     ##\r\n"
				+"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "     ##    ####    ##  ##    ####\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+"     ##       ##   ##  ##       ##\r\n");
		Thread.sleep(500);
		System.out.print(
		 "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+" ##  ##    #####   ##  ##    #####\r\n"
		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+" ##  ##   ##  ##    ####    ##  ##\r\n"
		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+"  ####     #####     ##      #####\r\n"
		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+"\r\n"
		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		
		
		Thread.sleep(500);
		System.out.println();
		

		System.out.print("⠀⠀ ###### ⠀                               ##\r\n"
				+ " ⠀⠀ ##  ##\r\n"
				+ "⠀⠀  ##  ##  ######    ####    ##  ##    ###     #####     ####\r\n"
				+ " ⠀⠀ #####    ##  ##  ##  ##   ##  ##     ##     ##  ##   ##  ##\r\n");
		Thread.sleep(500);
		System.out.print(
		 " ⠀ ⠀##       ##      ######   ##  ##     ##     ##  ##   ######\r\n"
		+ " ⠀⠀ ##       ##      ##        ####      ##     ##  ##   ##\r\n"
		+ "⠀⠀ ####     ####      #####     ##      ####    ##  ##    #####");
		
		
		System.out.println();
		for(int x = 0; x < 65; x++) {
			Thread.sleep(9);
			System.out.print("_");
		}
		
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
