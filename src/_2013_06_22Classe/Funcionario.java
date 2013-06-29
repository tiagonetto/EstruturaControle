/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package _2013_06_22Classe;

/**
 *
 * @author FACULDADE
 */
public class Funcionario {
    public String nome;
    public String departamento;
    public Double salario;
    public String dataEntrada;
    public String rg;
    public Boolean estaNaEmpresa;
    
    public void recebeAumento(double aumento){
      this.salario = this.salario + aumento;  
    }
    
    public double calculaGanhoAnual(){
        return this.salario * 12;
         
    }
    
    public void mostra()
    {
        System.out.println("");
        System.out.println("Dados do Funcionário");
        System.out.println("   nome: "+this.nome);
        System.out.println("   departamento: "+this.departamento);
        System.out.println("   salario: "+this.salario);
        System.out.println("   dataEntrada: "+this.dataEntrada);
        System.out.println("   rg: "+this.rg);
        System.out.println("   estaNaEmpresa: "+this.estaNaEmpresa);
        System.out.println("***************************************");
    }
            
            
    
}
