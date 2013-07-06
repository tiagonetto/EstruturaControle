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
        
        
        
        /*StringBuilder concatenasrting = new StringBuilder();
         * utilizaz builer ao inves de buffer pois buffer e sincronizado, caso estiver
         * em sistema concorrente espera sua vez....
        StringBuilder append = concatenasrting.append('1');*/
        
        /*
        Funcionario f1 = new Funcionario();
        f1.nome="Hugo";
        f1.departamento="Informática";
        f1.salario=100.00;
        f1.dataEntrada="29-03-2010";
        f1.rg= "49898989";
        f1.estaNaEmpresa = false;
        
        empresa.adiciona(f1);
        
        
        
        Funcionario f2 = new Funcionario();
        f2.nome="Tiago";
        f2.departamento="Programador";
        f2.salario=100.00;
        f2.dataEntrada="29-03-2010";
        f2.rg= "49898989";
        f2.estaNaEmpresa = true;
        
        empresa.adiciona(f2);
        */
        
        for (int i = 0; i<15; i++){  
            Funcionario f = new Funcionario();
            f.nome="Empregado_"+i;
            f.departamento="Departamento_"+i;
            f.salario=100.00 + i;
            f.dataEntrada="29-03-2010";
            f.rg= "49898989";
            f.estaNaEmpresa = true;
        
            empresa.adiciona(f);
            
        }
        
        
        
        empresa.mostraEmpresa();
        empresa.mostraEmpresaFuncionário();
        
    }
    
}
