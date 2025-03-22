package aula01;

/**
 *
 * @author andre
 */
public class Leao extends Animal {

    private boolean juba;
    
     public Leao(){};
    
    public Leao(float tamanho, String cor, boolean juba){
        super(tamanho, cor);
        this.juba = juba;
    
    }

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar(String animalCacado) {

        System.out.println("Leao caçando o animal: "+animalCacado);

    }
    
    public void imprimirLeao(){
        
        System.out.println("Tamanho Leao: "+this.getTamanho());
        System.out.println("Cor Leao: "+this.getCor());
        System.out.println("Leao tem Juba? "+this.getJuba());
    
    }

}
