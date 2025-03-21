package aula01;

/**
 *
 * @author andre
 */
public class PessoaPrincipal {

    public static void main(String[] args) {

        //Cliente oCliente = new Cliente("987.765.456-54", "Andre", "42", "Rua 10");

        Cliente oCliente = new Cliente();
        oCliente.setCpf("987.765.456-54");
        oCliente.setNome("Andre");
        oCliente.setEndereco("Rua 10");
        oCliente.setIdade("42");
        
        oCliente.imprimirCliente();

        Fornecedor oFornecedor = new Fornecedor();
        oFornecedor.setCnpj("45.567.876/0001-76");
        oFornecedor.setNome("Maria Eduarda");
        oFornecedor.setEndereco("Rua 01");
        oFornecedor.setIdade("54");

        oFornecedor.imprimirFornecedor();

    }

}
