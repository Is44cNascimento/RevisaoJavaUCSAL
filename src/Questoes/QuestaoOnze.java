package Questoes;

//11) Escreva um programa para ler o nome do cliente e o saldo inicial de uma conta bancária. A seguir ler um
//número indeterminado de pares de valores indicando respectivamente o tipo da operação (codificado da
//seguinte forma: 1.Depósito 2.Retirada 3.Fim) e o valor. Quando for informado para o tipo o código 3, o
//programa deve ser encerrado e impresso o saldo final da conta com as seguintes mensagens: CONTA ZERADA,
//CONTA ESTOURADA(se o saldo for negativo) ou CONTA PREFERENCIAL (se o saldo for positivo).
//        [http://www.cafw.ufsm.br/~leticia/lista3-c.pdf]

import java.util.Scanner;

public class QuestaoOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldo = 1000.15F;

        while (true){

            System.out.println("|1.Depósito 2.Retirada 3.Fim|");
            int opcao = sc.nextInt();

            if(opcao == 3){
                System.out.println("Fechando aplicativo bancario \n" + "Saldo: R$" + saldo);
                return;
            }else if (opcao == 1){
                System.out.println("||Deposito selecionado||");
                System.out.println("Saldo: R$" + saldo +"\n digite o valor a ser depositado: ");

                float valorDeposito = sc.nextFloat();

                saldo = saldo + valorDeposito;
                System.out.println("Saldo atualizado: R$" + saldo);

            } else if(opcao == 2){
                System.out.println("||retirada selecionada||");
                System.out.println("Saldo: R$" + saldo +"\n digite o valor a ser retirado: ");

                Float valorRetirado = sc.nextFloat();

                if(valorRetirado > saldo){
                    System.out.println("|CONTA ESTOURADA|");
                    System.out.println("Sem saldo: R$" + saldo);
                }else {
                    System.out.println("|CONTA PREFERENCIAL|");

                    saldo = saldo - valorRetirado;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
            }
            if(saldo == 0){
                System.out.println("conta zerada!!!");
            }
            System.out.println("|||Voltando para o menu principal||| \n \n");

        }

    }
}
