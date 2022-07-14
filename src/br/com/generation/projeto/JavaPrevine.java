package br.com.generation.projeto;

import java.util.Scanner;

public class JavaPrevine {

	public static void main(String[] args) {

		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		MenuPrincipal menu = new MenuPrincipal(entrada);
		CalculadoraCovid calculadora = new CalculadoraCovid(entrada);
		Diagnostico diagnostico = new Diagnostico(entrada);
		
		
		// looping do programa
		do {
			
			opcao = menu.menuPrincipal();
			
			switch(opcao) {
			// Calculadora
			case 1:
				
				// loop menu calculadora
				do {
					
					opcao = calculadora.menuCovid();					
					
					switch(opcao) {
					
					case 1:
						System.out.println("Quantas pessoas posso contaminar");
					
						break;
					
					
					case 2:
						System.out.println("N pessoas contaminam quantas pessoas em certo periodo?");
						
						break;
						
					case 3:
						System.out.println("Faca seu próprio calculo");
						
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
			
				break;
			
			// Diagnostico
			case 2:
				System.out.println("Bem vindo ao Diagnóstico");
					System.out.println(diagnostico.resultadoFinal()); 
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
