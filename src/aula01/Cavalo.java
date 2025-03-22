package aula01;

/**
 *
 * @author andre
 */
public class Cavalo extends Animal {

    public Cavalo(){};
    
    public Cavalo(float tamanho, String cor, String raca){
        super(tamanho, cor);
        this.raca = raca;
    
    }
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void fugir(String local) {

        System.out.println("Cavalo fugindo para: "+local);

    }
    
    public void imprimirCavalo(Cavalo cavalo){
        
        System.out.println("Tamanho Cavalo: "+cavalo.getTamanho());
        System.out.println("Cor Cavalo: "+cavalo.getCor());
        System.out.println("Raça Cavalo: "+cavalo.getRaca());
        
    
    }

}
