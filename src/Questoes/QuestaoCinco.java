package Questoes;

//5) Faça um algoritmo em Java que receba a idade de uma pessoa e informe em qual das categorias se
//enquadra em relação à obrigatoriedade do voto:
//• Sem permissão para votar (0 a 15 anos)
//• Voto facultativo (16 a 17 anos, acima de 65 anos)
//• Voto obrigatório (18 a 64 anos)


import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 0 && idade <= 15){
            System.out.println("Sem permissão para votar ");

        }else if(idade  >=  18 && idade <= 64){
            System.out.println("Voto obrigatório");
        }else if (idade == 16 || idade == 17 || idade > 65){
            System.out.println("Voto facultativo");
        }

    }
}
