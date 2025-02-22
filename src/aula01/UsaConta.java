package aula01;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class UsaConta {

    public static void main(String[] args) {

        Conta conta1 = new Conta();

        //depositando valores nas contas
        Scanner scan = new Scanner(System.in);

        double valor;
        double percentual;

        int opcao = 99;

        while (opcao != 0) {
            System.out.println("Digite o nome: ");
            conta1.setNome(scan.next());
            System.out.println("Digite o valor: ");
            valor = scan.nextDouble();
            System.out.println("Digite o percentual: ");
            percentual = scan.nextDouble();
            conta1.depositar(valor, percentual);
            System.out.println("Conta 1 - Nome: " + conta1.getNome());
            System.out.printf("Conta 1 - Saldo: %.2f \n", conta1.getSaldo());

            System.out.println("");
            System.out.println("----------------------");
            System.out.println("");
            System.out.println("0- Sair");
            System.out.println("1- Depositar novamente");

            opcao = scan.nextInt();

        }

    }

}
