package Questoes;

//16) Faça um programa que receba o nome e a idade de 20 pessoas e armazene em dois vetores. Uma vez
//preenchidos os vetores, o programa deve calcular a média das idades e listar os nomes das pessoas que têm
//idade acima da média.


import java.util.Scanner;

public class QuestaoDezesseis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int somaIdade = 0;


        int[] idade = new int[20];
        String[] nome = new String[20];

            for (int i = 0;i < idade.length;i++  ){
                System.out.println("Digite o seu nome");
                nome[i]= sc.next();

                System.out.println("Digite a sua idade");
                idade[i]=sc.nextInt();

                 somaIdade =+ somaIdade + idade[i];


        }
            double somaIdadeMedia = (somaIdade/20);
            System.out.println("A idade media foi: "+somaIdadeMedia);


        for (int i=0; i < idade.length;i++){

            if(idade[i] > somaIdadeMedia){
                System.out.println(nome[i] +" tem a idade acima da media: " + idade[i] + " anos \n");

            }
        }

    }
}
