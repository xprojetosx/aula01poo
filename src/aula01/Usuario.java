/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private int id;
    private String nome, endereco, email;
    private byte receita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getReceita() {
        return receita;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }
    
    
    
        
    public static void main(String[] args) {
        
        Usuario oUsuario = new Usuario();
        System.out.println("O valor do imposto do medicamento e: " + oUsuario.calculaImpostoMedicamento(200));
        
    }
    
    public void consultaMedicamento() {
        System.out.println("Metodo consulta medicamento");
    }
    
    public void comprarMedicamento() {
        System.out.println("Metodo comprar medicamento");
    }
    
    public void efetuaPagamento() {
        System.out.println("Metodo efetua pagamento");
    }
    
    public double calculaImpostoMedicamento(double valorMedicamento) {
        
        if (valorMedicamento > 100) {
            return valorMedicamento * 0.15;
        } else {
            return valorMedicamento * 0.10;
        }
    }
    
}
