package br.com.generation.projeto;

import java.io.IOException;
import java.util.Scanner;

public class JavaPrevine {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		
		int opcao;
		int infectadosInicial;
		double taxaInfeccao;
		double periodo;
		String resultado;


		Scanner entrada = new Scanner(System.in);
		MenuPrincipal menu = new MenuPrincipal(entrada);
		CalculadoraCovid calculadora = new CalculadoraCovid(entrada);
		Diagnostico diagnostico = new Diagnostico(entrada);
		
		menu.introducao();
		

		// looping do programa
		do {
			opcao = menu.menuPrincipal();

			switch (opcao) {
			// Calculadora
			case 1:

				// loop menu calculadora
				do {

					opcao = calculadora.menuCovid();

					switch (opcao) {
					case 1:
						System.out.println("\nQuantas pessoas posso contaminar \"Periodos\"");
						periodo = entrada.nextDouble();
						
						resultado = calculadora.contagio(periodo);
						System.out.println(resultado);
						System.out.println("\nPressione enter para voltar ao inicio.");
						System.in.read();

						break;

					case 2:
						System.out.println("\nNumero de pessoas contaminam quantas pessoas em certo periodo?");
						System.out.println("Pessoas infectadas");
						infectadosInicial = entrada.nextInt();
						System.out.println("Periodo");
						periodo = entrada.nextDouble();

						resultado = calculadora.contagio(infectadosInicial, periodo);
						System.out.println(resultado);
						System.out.println("\nPressione enter para voltar ao inicio.");
						System.in.read();
						
						break;

					case 3:
						System.out.println("\nFaca seu pr�prio calculo");
						System.out.print("Pessoas infectadas inicialmente: ");
						infectadosInicial = entrada.nextInt();
						System.out.print("Taxa de infeccao: ");
						taxaInfeccao = entrada.nextDouble();
						System.out.print("Periodo: ");
						periodo = entrada.nextDouble();
						System.out.println();
						resultado = calculadora.contagio(infectadosInicial, taxaInfeccao, periodo);
						System.out.println(resultado);
						System.out.println();
						System.out.println("\nPressione enter para voltar ao inicio.");
						System.in.read();

						break;

					// Sair
					case 0:

						System.out.println("Você saiu.");
						

						break;

					default:
						System.out.println("\nOpcao inv�lida!");
						break;
					}

				} while (opcao != 0);

				break;

			// Diagnostico
			case 2:
				menu.introducaoDiagnostico();
				
				System.out.println("-Bem vindo ao Diagn�stico\n\n");
				System.out.println(diagnostico.resultadoFinal());
				System.out.println("\nPressione enter para voltar ao inicio.");
				System.in.read();
				break;

			// Sair
			case 0:

				System.out.println("Você saiu.");

				break;

			default:
				System.out.println("Opcao inv�lida!");
				break;
			}

		} while (opcao != 0);

		entrada.close();
	}
}
