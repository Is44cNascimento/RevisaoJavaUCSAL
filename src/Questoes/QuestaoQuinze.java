package Questoes;

//15) Faça um programa que receba uma string e mostre-a na vertical.
//        Exemplo: palavra = “agora” ->
//a
//g
//o
//r
//a

import java.util.Scanner;

public class QuestaoQuinze {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++){
           System.out.println(palavra.charAt(i));
        }
    }
}
