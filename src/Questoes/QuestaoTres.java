package Questoes;

//3) Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
//média ponderada.

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaNP = 0;
        int somaPesos = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();

            System.out.print("Digite o peso da nota " + i + ": ");
            int peso = sc.nextInt();

            somaNP += nota * peso;
            somaPesos += peso;
        }

        sc.close();

        if (somaPesos > 0) {
            double mediaPonderada = somaNP / somaPesos;
            System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);
        } else {
            System.out.println("Erro: A soma dos pesos não pode ser zero.");
        }
    }
}
