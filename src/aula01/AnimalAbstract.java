package aula01;

/**
 *
 * @author andre
 */
public abstract class AnimalAbstract {

    public abstract double obterCotaDiariaDeLeite();
    
    //Tambem e permitido que se crie metodos nao abstratos
    public void imprimir(){
        System.out.println("aula01.AnimalAbstract.imprimir()");
    }

}
