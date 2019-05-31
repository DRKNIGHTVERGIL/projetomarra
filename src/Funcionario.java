/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ueg
 */
public class Funcionario extends Pessoa {

    float salario;
    
    public Funcionario() {
        nascimento = new Data();
    }
    

    @Override
    public String imprimeDados() {
        String retorno = "Salario " + salario;
        retorno += " Nome " + nome;
        retorno += " Data Nasc " + nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano;
        retorno += " Impostos " + calculaImposto();
        
        return retorno;
        
    }

    public float calculaImposto() {
        
        return (float) (salario * 0.03);

    }

}
