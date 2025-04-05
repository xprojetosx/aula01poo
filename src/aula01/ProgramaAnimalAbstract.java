
package aula01;

/**
 *
 * @author andre
 */
public class ProgramaAnimalAbstract {
    
    public static void main(String[] args) {
        
        AnimalAbstract gato = new GatoAbstract();
        System.out.println
                ("A cota diaria de leite do gato e: "+gato.obterCotaDiariaDeLeite());
        AnimalAbstract rato = new RatoAbstract();
        System.out.println
                ("A cota diaria de leite do rato e: "+rato.obterCotaDiariaDeLeite());
    }

}
