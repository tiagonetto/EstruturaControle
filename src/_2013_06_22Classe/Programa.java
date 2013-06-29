/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package _2013_06_22Classe;

/**
 * satcw.0239
 * 12021202
 * @author FACULDADE
 */
public class Programa {
    
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        
        /* Mesma referÊncia na memória,caso alterar algum valor irá impactar no outro...
         * Funcionario f2 = f1;*/
        Funcionario f2 = f1;
                
        /* Cria uma nova referencia na memória.*/
        Funcionario f3 = new Funcionario();
                
        
        f1.nome="Hugo";
        f1.departamento="Informática";
        f1.salario=100.00;
        f1.dataEntrada="29-03-2010";
        f1.rg= "49898989";
        f1.estaNaEmpresa = false;
        
        
        //System.out.println("Salário atual: "+f1.salario);
        //System.out.println("ganho anual: "+f1.calculaGanhoAnual());
        
        f2.nome="Hugo";
        f2.departamento="Informática";
        f2.salario=100.00;
        f2.dataEntrada="29-03-2010";
        f2.rg= "49898989";
        f2.estaNaEmpresa = true;
        
        
        f1.mostra();
        f2.mostra();
        
        
        
        if (f1 == f2){
            System.out.println("Mesma referência na memória");
        }else{
            System.out.println("Referência diferente na memória");
            
        }
        
    }
            
    
}
