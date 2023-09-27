
package numeroimparopar;

import java.util.Scanner;


public class numeroimparopar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);      
            System.out.print("ingresa un numero entero: ");      
            int numero = scanner.nextInt();
            scanner.close();
       
        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
}


