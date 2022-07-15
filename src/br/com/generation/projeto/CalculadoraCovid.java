package br.com.generation.projeto;

import java.util.Scanner;

public class CalculadoraCovid {

    // referencia:
    // https://noticias.r7.com/saude/taxa-de-transmissao-da-covid-cai-no-brasil-aponta-imperial-college-29062022


    int a1 = 1;
    double q = 1.7;
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
    public String contagio(int a1, double q, double n) {
        double totalContagiados;

        if(q <= 1) {
            totalContagiados = (a1*Math.pow(q, n)*n);

            return "Voce tem essa chance de contaminar uma pessoa: "+totalContagiados;
        }else {
            totalContagiados = (a1*Math.pow(q, n)*2)/3;

            return "o numero de novos contagiados: "+totalContagiados;
        }


    }

    /*
        soh pede o per�odo
    */
    public String contagio(double n) {
        double totalContagiados;

        if(q < 1) {
            totalContagiados = (a1*Math.pow(q, n)*n);

            return "Voce tem essa chance de contaminar uma pessoa: "+totalContagiados;
        }else {
            totalContagiados = a1*Math.pow(q, n);

            return "o numero de infectados sera: "+totalContagiados;
        }


    }

    // pede quantidade de pessoas inicias e numero de periodos
    public String contagio(int a1, double n) {
        double totalContagiados;

        if(q < 1) {
            totalContagiados = (a1*Math.pow(q, n) * n);

            return "Voce tem essa chance de contaminar uma pessoa: "+totalContagiados;

        }else {
            totalContagiados = a1*Math.pow(q, n);
            return "o numero de novos contagiados: "+totalContagiados;
        }

    }

    public int menuCovid() {

        System.out.println(" ______________________________________________________________");
        System.out.println("| 		           Calculadora Covid	                       |");
        System.out.println("|  							           	                       |");
        System.out.println("| 	1. Quantas pessoas posso contaminar?	                   |");
        System.out.println("|   2. N pessoas contaminam quantas pessoas em certo periodo?  |");
        System.out.println("|   3. Faça seu próprio calculo		                           |");
        System.out.println("|  	0. Sair						           	                   |");
        System.out.println("|______________________________________________________________|");
        System.out.print(" Digite uma opção válida: ");

		opcao = entrada.nextInt();
        System.out.println("Observacao *  - os calculos sao feitos com dados retirados de: https://noticias.r7.com/saude/taxa-de-transmissao-da-covid-cai-no-brasil-aponta-imperial-college-29062022");

        return opcao;
    }
}
