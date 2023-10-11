/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafibonacci;


import java.util.Scanner;

/**
 *
 * @author ismael colin
 */
public class PracticaFibonacci {
    public static void main(String[] args) {
         int cero=0, uno=1, suma;
           System.out.println("Serie Fibonacci");
           Scanner scanner = new Scanner(System.in);
           System.out.println("Ingrese los digitos deseados");
           int valor = scanner.nextInt();
           scanner.close();
         
         
         
         System.out.println("La serie Fibonacci de: " + valor);    
         for (int i= 1; i<valor ; i++){
         System.out.println(+cero);
        
        
        
        suma= cero+uno;              
        cero=uno;       
        uno=suma;
         }      
                                  
    }

    
}
