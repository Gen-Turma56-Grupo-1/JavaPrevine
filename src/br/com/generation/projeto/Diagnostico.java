package br.com.generation.projeto;

import java.util.Scanner;

public class Diagnostico {

    public Diagnostico(Scanner entrada) {
        this.entrada = entrada;
    }

    int sintomas = 0;
    int pontuacaoTotal;
    int pontuacao2;
    int pontuacao3;

    private Scanner entrada;


    public String resultadoFinal() {
        sintomas += quizSintomasLeves();
        sintomas += quizSintomasModerados();
        sintomas += quizSintomasGraves();
        pontuacaoTotal = sintomas;

        if (pontuacaoTotal < 4 && pontuacaoTotal > 0)
            return "\nVocê apresenta sintomas leves, caso piore, procure o médico!";
        if (pontuacaoTotal >= 4 && pontuacaoTotal < 6)
            return "\nVocê apresenta sintomas moderados fique atento e procure um médico caso não haja melhora!";
        if (pontuacaoTotal >= 6)
            return "\nVocê apresenta sintomas graves, procure o médico o quanto antes!";
        return "valor digitado invalido";
    }

    public int quizSintomasLeves() {

        do {
            // cada sintoma equivale a +1 pontuação
            System.out.println("+-----------------------------------------------------------------+");
            System.out.println("| Na ultima semana voce apresentou quantos desses sintomas leves? |");
            System.out.println("+-------------------------------+---------------------------------+");
            System.out.println("| - Febre                       |");
            System.out.println("| - Tosse                       |");
            System.out.println("| - Cansaco                     |");
            System.out.println("| - Perda de paladar ou olfato  |");
            System.out.println("+-------------------------------+");
            System.out.print(" Digite a quantidade de sintomas: ");

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

            System.out.println("\n+---------------------------------------------------------------------+");
            System.out.println("| Na ultima semana voce apresentou quantos desses sintomas moderados? |");
            System.out.println("+--------------------+------------------------------------------------+");
            System.out.println("| - Dores de garganta                                                |");
            System.out.println("| - Dor de cabeca                                                    |");
            System.out.println("| - Dores e desconfortos                                             |");
            System.out.println("| - Diarreia                                                         |");
            System.out.println("| - Irritacoes na pele ou descoloracao dos dedos dos pes ou das maos |");
            System.out.println("| - Olhos vermelhos ou irritados                                     |");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.print(" Digite a quantidade de sintomas: ");

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

        do {
            System.out.println("\n+------------------------------------------------------------------+");
            System.out.println("|Na ultima semana você apresentou quantos desses sintomas graves?  |");
            System.out.println("+--------------------------------------------+---------------------+");
            System.out.println("| - Dificuldade para respirar ou falta de ar |");
            System.out.println("| - Perda da fala, mobilidade ou confusão    |");
            System.out.println("| - Dores no peito                           |");
            System.out.println("+--------------------------------------------+");
            System.out.print(" Digite digite a quantidade de sintomas: ");

            sintomas = entrada.nextInt();
            pontuacao3 = sintomas * 6;
            pontuacaoTotal += pontuacao3;
            if (sintomas > 3) {
                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
            }
        } while (sintomas > 3);

        return pontuacao3;
    }
}
