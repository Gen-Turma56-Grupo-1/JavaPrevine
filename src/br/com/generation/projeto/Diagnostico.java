package br.com.generation.projeto;

import java.util.Scanner;

public class Diagnostico {
	public Diagnostico(Scanner entrada) {
		this.entrada = entrada;
	}
	
	int sintomas = 0;
	int pontuacaoTotal;
	
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
		
		// colocar codigo aqui
		
		return 0;
	}
	
	public int quizSintomasModerados() {
		
		// colocar codigo aqui
		
		return 0;
	}
	
	public int quizSintomasGraves() {
		
		// colocar codigo aqui
		
		return 0;
	}

}
