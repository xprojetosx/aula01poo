package aula01;

/**
 *
 * @author andre
 */
public class Cliente extends Pessoa {
    
    private String cpf;
    public Cliente(){}
    public Cliente(String cpf, String nome, String idade, String endereco){
        super(nome, idade, endereco);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void imprimirCliente() {

        System.out.println("CPF do cliente: " + this.getCpf());
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("Idade do cliente: " + this.getIdade());
        System.out.println("Endereco do cliente: " + this.getEndereco());

    }

}
