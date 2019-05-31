/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ueg
 */
public class Cliente extends Pessoa{
    
    int codigo;

    public Cliente() {
        nascimento = new Data();
    }
    
    
    

    @Override
    public String imprimeDados() {
        
        String retorno = "Codigo " + codigo;
         retorno += " Nome " + nome;
         retorno += " Data Nasc " + nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano;
        
        return retorno;
        
    }
    
}
