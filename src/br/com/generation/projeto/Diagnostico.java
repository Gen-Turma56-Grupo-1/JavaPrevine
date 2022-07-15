package br.com.generation.projeto;

import java.util.Scanner;

public class Diagnostico {
	public Diagnostico(Scanner entrada) {
		this.entrada = entrada;
	}
	
	int sintomas = 0;
	int pontuacaoTotal;
	int pontuacao2;
	
	private Scanner entrada;
	
	
	public String resultadoFinal() {
		sintomas += quizSintomasLeves();
		sintomas += quizSintomasModerados();
		sintomas += quizSintomasGraves();
		pontuacaoTotal = sintomas;
		
		if(pontuacaoTotal < 5) {
			// colocar codigo
		}
		
		return " // colocar o codigo";
	}
	
	public int quizSintomasLeves() {
		
		 do {
	            System.out.println("Na ultima semana você apresentou quantos desses sintomas leves?");
	            // cada sintoma equivale a +1 pontuação
	            System.out.println("- Febre");
	            System.out.println("- Tosse");
	            System.out.println("- Cansaço");
	            System.out.println("- Perda de paladar ou olfato");

	            System.out.print("Digite a quantidade de sintomas: ");
	            sintomas = entrada.nextInt();
	            pontuacaoTotal = sintomas;
	            if (pontuacaoTotal > 4) {
	                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
	            }
	        } while (pontuacaoTotal > 4);
		
		
		
		return pontuacaoTotal;
	}
	
	public int quizSintomasModerados() {
		
		do {
			
            System.out.println("Na ultima semana você apresentou quantos desses sintomas moderados?");
            System.out.println("- Dores de garganta");
            System.out.println("- Dor de cabeça");
            System.out.println("- Dores e desconfortos");
            System.out.println("- Diarreia");
            System.out.println("- Irritações na pele ou descoloração dos dedos dos pés ou das mãos");
            System.out.println("- Olhos vermelhos ou irritados");

            System.out.print("Digite a quantidade de sintomas: ");

            sintomas = entrada.nextInt();
            pontuacao2 = sintomas * 2;
            pontuacaoTotal += pontuacao2;
            if (sintomas > 6) {
                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
            }
        } while (sintomas > 6);
		
		return pontuacao2;
	}
	
	public int quizSintomasGraves() {
		
		// colocar codigo aqui
		
		return 0;
	}

}
