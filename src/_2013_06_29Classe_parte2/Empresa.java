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
public class Empresa {
    
    String nome;
    String cnpj;
    Funcionario[] empregados;
    
    //empresa.empregados = new Funcionario[10];
    //Funcionario empregados = new Funcionario[10];
    
    void adiciona(Funcionario f)
    {
       for(int i=0;i<empregados.length;i++){
          if (empregados[i] == null ) {
              empregados[i] = f;
              break;
          };
          System.out.println("   contador:"+i);
       }
        
        
       //empregados[0] = f; 
    }
    
    void mostraEmpresa()
    {
        
        System.out.println("**********************");
        System.out.println("**********************");
        
        System.out.println("");
        System.out.println("Dados da Empresa");
        System.out.println("nome: "+this.nome);
        System.out.println("cnpj: "+this.cnpj);
        
    }
    
    void mostraEmpresaFuncionário()
    {
        Funcionario funcionarioMostra = new Funcionario();
        
        for(int i=0;i<empregados.length;i++){
            if (empregados[i] != null ) {
            
               funcionarioMostra =empregados[i];
               funcionarioMostra.mostra();    
                
             };
         // System.out.println("   contador:"+i);
        }
        
        
    }
    
    
    }
    
    
    

