
package aula01;

/**
 *
 * @author andre
 */
public class Fornecedor extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirFornecedor() {

        System.out.println("CNPJ do Fornecedor: " + this.getCnpj());
        System.out.println("Nome do Fornecedor: " + this.getNome());
        System.out.println("Idade do Fornecedor: " + this.getIdade());
        System.out.println("Endereco do Fornecedor: " + this.getEndereco());

    }

}
