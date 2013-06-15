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
public class Array3 {
    
     public static void main(String[] args) {
       String reg[][] = new String[3][3];
       
       
       reg[0][0] = "Florence";
       reg[0][1] = "735-1234";
       reg[0][2] = "Manila";
       
       reg[1][0] = "Joyce";
       reg[1][1] = "983-3333";
       reg[1][2] = "Quezon City";
       
       reg[2][0] = "Becca";
       reg[2][1] = "456-3322";
       reg[2][2] = "Manila";
       
       
   
       for(int i=0;i<reg.length;i++){
         
           for(int j=0; j<reg[i].length;j++){
              System.out.println(reg[i][j]);         
           };
           System.out.println(".....................");
       };
       
       //System.out.println(String.valueOf(maior));
    }
    
    
}
