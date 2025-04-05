package aula01;

/**
 *
 * @author andre
 */
public class ProgramaOperacaoMatematica {

    //Exemplo de utilizacao do polimorfismo
    //utilizando o metodo static para poder utiliza-lo na mesma classe
    public static void
            calculaOperacao(OperacaoMatematica operacao, double x, double y) {

        System.out.println(operacao.calcular(x, y));
    }

    public static void main(String[] args) {

        calculaOperacao(new Soma(), 10, 10);
        calculaOperacao(new Subtrai(), 10, 10);
        calculaOperacao(new Multiplica(), 10, 10);
        calculaOperacao(new Divide(), 10, 10);

    }

}
