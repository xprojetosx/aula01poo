package aula01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ProgramaImc {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        PessoaImc pessoa = new PessoaImc();
        SaudeImc saude = new SaudeImc();

        do {
            System.out.println("Digite o CPF:");
            pessoa.setCpf(scan.next());
            System.out.println("Digite o nome:");
            pessoa.setNome(scan.next());
            System.out.println("Digite o peso:");
            pessoa.setPeso(scan.nextDouble());
            System.out.println("Digite a Altura:");
            pessoa.setAltura(scan.nextDouble());
            System.out.println("--------------------------------------");
            System.out.println("IMC: " + String.format("%.2f", saude.calculaImc(pessoa)) + " -- " + saude.interpretaImc(saude.calculaImc(pessoa)));

            System.out.println("--------------------------------------");
            System.out.println("Digite 1 para calcular o IMC novamente");
            System.out.println("Digite 0 para sair");
            System.out.println("--------------------------------------");

            opcao = scan.nextInt();

        } while (opcao != 0);

        scan.close();
        System.out.println("Programa Encerrado;");
    }

}
