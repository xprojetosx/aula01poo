package aula01;

/**
 *
 * @author andre
 */
public class Soma extends OperacaoMatematica {

    // Indica que o metodo e sobreposto (exemplo classico de polimorfismo)
    @Override
    public double calcular(double x, double y) {

        return x + y;

    }

}
