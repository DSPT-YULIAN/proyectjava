package Arrays;
import java.util.Scanner;

public class ArreglostablasElem {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int elemento, posicion;
		
		int t[]=new int[10];
		
		
		for (int i=0;i<8;i++){
		
		System.out.print("Introduzca número: ");
		
		t[i]= entrada.nextInt();
		}
		
		
		
		System.out.print("Nuevo elemento: ");
		elemento = entrada.nextInt();
		System.out.print("Posición donde insertar (de 0 a 8): ");
		posicion = entrada.nextInt();
		
	
		for (int i=7;i>=posicion;i--) {
		t[i+1]=t[i];
		
		
		t[posicion] =elemento;

		}

		System.out.println("La tabla queda:");
		for (int i=0;i<9;i++) {
			
		System.out.println(t[i]);

	}

}

}