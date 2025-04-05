
package aula01;

/**
 *
 * @author andre
 */
public interface Veiculo {
    
    public String placa = "";
    public double velMax = 0;
    public void iniciar();
    public void parar();
    
    default void imprimir(){
        System.out.println("aula01.Veiculo.imprimir()");
    }
    
    

}
