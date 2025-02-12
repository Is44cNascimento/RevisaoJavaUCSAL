package Questoes;

//7) Faça um programa em Java que receba três valores inteiros referentes ao tamanho dos três lados de um
//triângulo. Para formar um triângulo cada lado deve ser menor do que a soma dos outros dois lados. Uma vez
//verificado que os valores estão corretos (ou seja, formam um triângulo) o programa deve classifica-lo em
//equilátero (todos os lados iguais), isósceles (dois lados iguais), escaleno (todos os lados diferentes).

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int ladoUm,ladoDois,ladoTres;

        System.out.print("Digite o lado 'um' : ");
        ladoUm = sc.nextInt();
        System.out.print("Digite o lado 'dois' : ");
        ladoDois = sc.nextInt();
        System.out.print("Digite o lado 'tres' : ");
        ladoTres = sc.nextInt();


        int somaLaUD = ladoUm + ladoDois;
        int somaLaUT = ladoUm + ladoTres;


        if (somaLaUT >= ladoDois && somaLaUD >= ladoTres){

            if(ladoUm == ladoTres && ladoTres == ladoDois){
                System.out.println("equilátero");
            } else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoTres == ladoDois){
                System.out.println("isósceles");
            }if(ladoUm != ladoDois && ladoUm != ladoTres && ladoTres != ladoDois){
                System.out.println("escaleno");
            }
        } else {
            System.out.println("Para formar um triângulo cada lado deve ser menor do que a soma dos outros dois lados");
        }


    }
}
