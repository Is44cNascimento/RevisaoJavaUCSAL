package Questoes;


//10)Faça um programa que receba um número e informe se é um termo da sequência de Fibonacci. Na
//        sequência de Fibonacci cada termo é a soma dos dois termos anteriores:
//        1, 1, 2, 3, 5, 8, 13...

import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int x,y, input;
        x=0;
        y=1;
        input = sc.nextInt();

        for(int i = 0 ; y < input; i++){

            int prox = x;
            x = y;
            y = prox + x;

            System.out.println("x:" + x );
        }


    }
}
