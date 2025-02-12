package Questoes;


//6) As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem
//compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o valor total da compra.


import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite a quantidade de macas: ");
        int quantidadeMaca = sc.nextInt();


        if(quantidadeMaca < 12){
            double quantidadeValor = quantidadeMaca * 0.30;
            System.out.println("O valor pago sera: "  + quantidadeValor);
        } else if(quantidadeMaca >= 12){
            double quantidadeValor = quantidadeMaca * 0.25;
            System.out.println("O valor pago sera: "  + quantidadeValor);
        }

    }
}
