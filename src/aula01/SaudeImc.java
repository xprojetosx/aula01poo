package aula01;

/**
 *
 * @author andre
 */
public class SaudeImc {

    public double calculaImc(PessoaImc pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public String interpretaImc(double imc) {

        String interpretacao;

        if (imc >= 18.5) {
            if (imc < 25) {
                interpretacao = "Peso Normal";
            } else if (imc < 30) {
                interpretacao = "Pre-Obesidade";
            } else if (imc < 35) {
                interpretacao = "Obesidade Grau I";
            } else if (imc < 40) {
                interpretacao = "Obesidade Grau II";
            } else {
                interpretacao = "Obesidade Grau III";
            }
        } else {
            interpretacao = "IMC menor que 18.5";
        }
        return interpretacao;
    }

}
