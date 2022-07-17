package br.com.generation.projeto;

import java.util.Scanner;

public class CalculadoraCovid {

    

    int a1 = 1;
    double q = 1.7;
    double n;

    private Scanner entrada;
    private int opcao;

    MenuPrincipal introducaoCalculadora = new MenuPrincipal(entrada);
    
    
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

         
            totalContagiados = (a1*Math.pow(q, n));

            return "O número de novos contagiados no final desse período: "+totalContagiados;
        


    }

    /*
        soh pede o perï¿½odo
    */
    public String contagio(double n) {
        double totalContagiados;

       
            totalContagiados = a1*Math.pow(q, n);

            return "O número de contagiados no final desse período: "+totalContagiados;
        


    }

    // pede quantidade de pessoas inicias e numero de periodos
    public String contagio(int a1, double n) {
        double totalContagiados;

      
            totalContagiados = a1*Math.pow(q, n);
            return "O número de novos contagiados no final desse período: "+totalContagiados;
        

    }

    public int menuCovid() throws InterruptedException {
    	
    	introducaoCalculadora.introducaoCalculadora();
    	
    	System.out.println("\n\n");

        System.out.println(" ______________________________________________________________");
        System.out.println("| 		           Calculadora Covid	                       |");
        System.out.println("|  							           	                       |");
        System.out.println("| 	1. Quantas pessoas posso contaminar?	                   |");
        System.out.println("|   2. Adicione quantos casos iniciais e período para determinar os novos casos  |");
        System.out.println("|   3. FaÃ§a seu prÃ³prio calculo		                       |");
        System.out.println("|  	0. Sair						           	                   |");
        System.out.println("|______________________________________________________________|");
        System.out.print(" Digite uma opÃ§Ã£o vÃ¡lida: ");

		opcao = entrada.nextInt();
        
        return opcao;
    }
}
