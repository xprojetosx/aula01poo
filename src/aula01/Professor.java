
package aula01;

/**
 *
 * @author andre
 */
public class Professor extends PessoaAbstract {
    
    //exemplo de polimorfismo
    @Override
    public void respirar() {

        System.out.println("Respirando de outra forma 2");

    }

    public void darAula() {
        System.out.println("Dando aula");

    }
    
}
