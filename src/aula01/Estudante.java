
package aula01;

/**
 *
 * @author andre
 */
public class Estudante extends PessoaAbstract {

    @Override
    public void respirar() {

        System.out.println("Respirando de outra forma");

    }

    public void fazerProva() {
        System.out.println("Fazendo prova");

    }

}
