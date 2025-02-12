package Questoes;

//2) Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e
//        informe quantos segundos do dia já passaram.


import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int h,m,s;
        System.out.print("Digite a hora: ");
        h = sc.nextInt() ;
        System.out.print("Digite o minuto: ");
        m = sc.nextInt() ;
        System.out.print("Digite o segundo: ");
        s = sc.nextInt() ;



        int hh,mm,ss;

        hh = h * 3600;
        mm = m *60;
        ss = s + mm + hh;

        System.out.println(" Voce tem "  + ss + " segundos.");

    }
}
