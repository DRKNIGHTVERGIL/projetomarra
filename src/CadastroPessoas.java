
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ueg
 */
public class CadastroPessoas {
    
    int qtdeAtual = 0;
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    
    public void cadastraPessoa(Pessoa pess){
        pessoas.add(pess);
        qtdeAtual++;
    }
    
    public String imprimeCadastro(){
        
        String retorno = "";
        
        for (Pessoa objeto : pessoas) {
            retorno += objeto.imprimeDados()+ "\n";
        }
        
        
        return retorno;
        
    }
    
}
