package Questoes;

//17) Faça um programa que preencha um vetor com 50 valores recebidos pelo teclado e, ao final, informe a
//posição do maior número. Desconsidere a possibilidade de empate


import java.util.Scanner;

public class QuestaoDezessete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] valores = new int[50];

        for(int i =0; i < valores.length; i++){

           System.out.println("digite o numero " + i);
            valores[i] = sc.nextInt();
        }

        int[] valorMax  = new int[1];
        valorMax[0] = 0;
        for (int i = 0; i < valores.length; i++){

            if(valorMax[0] < valores[i]){
                valorMax[0] = valores[i];
            }
        }
        System.out.println("Esse foi o maior numero: "+valorMax[0]);

    }
}
