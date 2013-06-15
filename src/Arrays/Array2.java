/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author FACULDADE
 */
public class Array2 {
    public static void main(String[] args) {
       int numero[] = new int[10];
       int maior = 0;
       
       System.out.println("Informe 10 Numeros");
       Scanner s = new Scanner(System.in);
       
       numero[0] = s.nextInt();
       numero[1] = s.nextInt();
       numero[2] = s.nextInt();
       numero[3] = s.nextInt();
       numero[4] = s.nextInt();
       numero[5] = s.nextInt();
       numero[6] = s.nextInt();
       numero[7] = s.nextInt();
       numero[8] = s.nextInt();
       numero[9] = s.nextInt();
   
       for(int i=0;i<numero.length -1;i++){
          if (numero[i] > maior) {
             maior = numero[i];
          }
                  
       };
       
       System.out.println(String.valueOf(maior));
    }
}
