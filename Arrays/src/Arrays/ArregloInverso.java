//problema 1 

// Leer 5 n�meros y mostrarlos en orden inverso al introducido.

package Arrays;

import java.util.Scanner;

public class ArregloInverso {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		
        Scanner numero = new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
        	
            System.out.print("Introduce un n�mero: ");
            
            num[i]=numero.nextInt();            
        }
        System.out.println("Numeros en orden inverso.");
        
        for (int i = num.length - 1; i >= 0 ; i--) {
        	
            System.out.println("Indice  " + i + " =" + num[i]);


        }

	}
}
