
package aula01;

/**
 *
 * @author andre
 */

//exemplo de classe abstrata
public abstract class PessoaAbstract implements PessoaInterface{
    
    @Override
    public void respirar(){
        System.out.println("Respirando...");
    }

}
