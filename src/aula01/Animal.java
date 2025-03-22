package aula01;


/**
 *
 * @author andre
 */
public class Animal {

    private float tamanho;
    private String cor;
    
    public Animal(){};
    
    public Animal(float tamanho, String cor){
    
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(String comida) {
        System.out.println("Animal comendo: "+comida);
    }

}
