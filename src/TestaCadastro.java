/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ueg
 */
public class TestaCadastro {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.codigo = 1;
        cliente.nome = "Nome do cliente";
        cliente.nascimento.dia = 1;
        cliente.nascimento.mes = 1;
        cliente.nascimento.ano = 2001;

        Funcionario funcionario = new Funcionario();
        funcionario.salario = 1250;
        funcionario.nome = "Nome do Funcionario";
        funcionario.nascimento.dia = 1;
        funcionario.nascimento.mes = 1;
        funcionario.nascimento.ano = 2001;

        Gerente gerente = new Gerente();
        gerente.area = "UEG";
        gerente.salario = 1250;
        gerente.nome = "Nome do Gerente";
        gerente.nascimento.dia = 1;
        gerente.nascimento.mes = 1;
        gerente.nascimento.ano = 2001;
        
        
        CadastroPessoas cadastro = new CadastroPessoas();
        
        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);
        
        
        
        System.out.println(cadastro.imprimeCadastro());
        

    }

}
