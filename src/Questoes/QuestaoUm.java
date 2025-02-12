package Questoes;
//1) Faça um programa em Java que receba uma temperatura em centígrados e transforme para fahrenheit.
//        Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.



import java.util.Scanner;


public class QuestaoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("conversor  de centígrados  para fahrenheit ");
        System.out.println("Digite um valor em  centígrados: ");
        int cent = sc.nextInt();
        int fah = ( (9 * cent ) +160)/5;
        System.out.println("Valor em fahrenheit: " + fah);
    }
}