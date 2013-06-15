/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author FACULDADE
 */
public class Array1 {
  public static void main(String[] args) {
     String days[] = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"}; 
     Integer i=0;      
     
     System.out.println("while");
     while(i<7){
       System.out.println(days[i]);  
       i++;
     };
     System.out.println("DO WHILE");
     
     i=0;
     do
     {
       System.out.println(days[i]);  
       i++;
     } while(i<7);
     
     System.out.println("FOR");
     for(i=0;i<7;i++)
     {
         System.out.println(days[i]);
     };
     
     
  }
}
