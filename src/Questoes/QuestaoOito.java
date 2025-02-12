package Questoes;

// 8) A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa em Java que
//receba o enquadramento do professor e a quantidade de horas trabalhadas, calcule e exiba o salário do
//professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//Enquadramento Valor da hora/aula
//Nível 1 R$12,00
//Nível 2 R$17,00
//Nível 3 R$25,00
//Fonte: http://www.comp.uems.br/~mercedes/disciplinas/2013/AEDI/Estrutura%20Condicional%20Resolvida.pdf


import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nivel");
        int nivel = sc.nextInt();


        if (nivel == 1){
            System.out.println("||| Nivel 1 definido ||| \n ");

            System.out.println("Digite a carga horaria em horas: ");
            double hora = sc.nextInt();

            double calculoNivelUm = hora * 12.00;
            System.out.println("O seu salario vai ser de: "+ calculoNivelUm);

        } else if (nivel == 2) {
            System.out.println("||| Nivel 2 definido ||| \n");

            System.out.println("Digite a carga horaria em horas: ");
            double hora = sc.nextInt();

            double calculoNivelDois = hora * 17.00;
            System.out.println("O seu salario vai ser de: "+ calculoNivelDois);

        }else if(nivel == 3){
            System.out.println("||| Nivel 3 definido ||| ");

            System.out.println("Digite a carga horaria em horas: ");
            double hora = sc.nextInt();

            double calculoNivelTres = hora * 25.00;

            System.out.println("O seu salario vai ser de: "+ calculoNivelTres);

        }

    }
}
