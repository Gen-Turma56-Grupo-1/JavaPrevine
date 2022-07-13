package br.com.generation.projeto;

import java.util.Scanner;

public class JavaPrevine {

	public static void main(String[] args) {

		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		
		// looping do programa
		do {
			
			System.out.println("MENU - SISTEMA");

			System.out.println("1 - Calculadora Covid");
			System.out.println("2 - Diagnóstico");
			System.out.println("0 - Para sair");
			System.out.print("Digite uma opção válida: ");
			opcao = entrada.nextInt();

			
			
			switch(opcao) {
			// Calculadora
			case 1:
				System.out.println("Bem vindo a Calculadora");
			
				break;
			
			// Diagnostico
			case 2:
				System.out.println("Bem vindo ao Diagnóstico");
				
				break;
				
			// Sair
			case 0:
				
				System.out.println("AUA FUI!");
				
				break;
			
			default:
				System.out.println("Opcao inválida!");
				break;
			}
			

		}while(opcao != 0);	
		
		entrada.close();
	}
}
