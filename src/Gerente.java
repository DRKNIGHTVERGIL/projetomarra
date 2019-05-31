/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ueg
 */
public class Gerente extends Funcionario {

    String area;

    public Gerente() {
        nascimento = new Data();
    }

    @Override
    public float calculaImposto() {
        return (float) (salario * 0.05);
    }

    @Override
    public String imprimeDados() {

        String retorno = "Salario " + salario;
        retorno += " Nome " + nome;
        retorno += " Data Nasc " + nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano;
        retorno += " Impostos " + this.calculaImposto();
        retorno += " Area " + area;

        return retorno;
    }

}
