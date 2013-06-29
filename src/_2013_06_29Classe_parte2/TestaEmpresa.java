/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package _2013_06_29Classe_parte2;
import _2013_06_22Classe.Funcionario;

/**
 *
 * @author FACULDADE
 */
public class TestaEmpresa {
    public static void main(String[] args){
        
        Empresa empresa = new Empresa();  
        empresa.empregados = new Funcionario[10];
        
        
        empresa.nome = "SATC";
        empresa.cnpj = "49494949";
        
        Funcionario f1 = new Funcionario();
        f1.nome="Hugo";
        f1.departamento="Informática";
        f1.salario=100.00;
        f1.dataEntrada="29-03-2010";
        f1.rg= "49898989";
        f1.estaNaEmpresa = false;
        
        empresa.adiciona(f1);
        
        
        
        
        
        empresa.mostraEmpresa();
        empresa.mostraEmpresaFuncionário();
        
    }
    
}
