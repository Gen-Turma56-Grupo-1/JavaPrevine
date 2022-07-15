package br.com.generation.projeto;

import java.util.Scanner;

public class CalculadoraCovid {

    // referencia:
    // https://noticias.r7.com/saude/taxa-de-transmissao-da-covid-cai-no-brasil-aponta-imperial-college-29062022


    int a1 = 1;
    double q = 0.98;
    double n;

    private Scanner entrada;
    private int opcao;

    public CalculadoraCovid(Scanner entrada) {
        this.entrada = entrada;

    }

    /*
        int a1 -> Quantidade de pessoas infectadas inicial
        double q -> taxa de infeccao
        double n -> numero de rodadas/periodo.
    */
    public double contagio(int a1, double q, double n) {
        double totalContagiados;

        totalContagiados = a1 * Math.pow(q, n);


        return totalContagiados;
    }

    /*
        soh pede o per�odo
    */
    public double contagio(double n) {
        double totalContagiados;

        totalContagiados = a1 * Math.pow(q, n);


        return totalContagiados;
    }

    // pede quantidade de pessoas inicias e numero de periodos
    public double contagio(int a1, double n) {
        double totalContagiados;

        totalContagiados = a1 * Math.pow(q, n);


        return totalContagiados;
    }

    public int menuCovid() {

        System.out.println(" ______________________________________________________________");
        System.out.println("| 		           Calculadora Covid	                       |");
        System.out.println("|  							           	                       |");
        System.out.println("| 	1. Quantas pessoas posso contaminar?	                   |");
        System.out.println("|   2. N pessoas contaminam quantas pessoas em certo periodo?  |");
        System.out.println("|   0. Faça seu próprio calculo		                           |");
        System.out.println("|______________________________________________________________|");
        System.out.print(" Digite uma opção válida: ");
		opcao = entrada.nextInt();
        System.out.println("Observacao *  - os calculos sao feitos com dados retirados de: https://noticias.r7.com/saude/taxa-de-transmissao-da-covid-cai-no-brasil-aponta-imperial-college-29062022");

        return opcao;
    }
}
