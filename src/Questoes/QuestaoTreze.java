package Questoes;

//13) Faça um programa que receba um número inteiro e informe se é um número primo.

import java.util.Scanner;

public class QuestaoTreze {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero para verificar se [e primo: ");
        int numero = sc.nextInt();

        if ((numero % 2 == 0 ) && (numero != 2) ){
            System.out.print("numero nao  [e primo");

        } else if(!(numero % 2 == 0) || (numero == 2)){
            System.out.print("numero  primo");
        }

    }
}
