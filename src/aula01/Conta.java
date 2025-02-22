package aula01;

/**
 *
 * @author andre
 */
public class Conta {

    private double saldo;
    private String nome;

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Acumula no saldo um valor x mais 10%
     *
     * @param valor double - indica o valor a ser depositado
     * @param percentual double - indica o valor a ser depositado
     */
    public void depositar(double valor, double percentual) {
        this.saldo = this.saldo + valor + (valor * (percentual / 100));
    }

}
