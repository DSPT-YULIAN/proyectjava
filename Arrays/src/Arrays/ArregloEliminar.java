package Arrays;

import java.util.Scanner;

public class ArregloEliminar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int t[]=new int[10];
		int posicion;
		
		
		
		for (int i=0;i<10;i++)
		{
		System.out.print("Indice ("+i+"): ");
		t[i]= entrada.nextInt();
		}

	

		System.out.println();
		
		System.out.print("Posición a eliminar: ");
		posicion= entrada.nextInt();

	
		for (int i=posicion;i<9;i++) 
		t[i] = t[i+1];
		
		
		System.out.println("La tabla queda: ");
		for (int i=0;i<9;i++)
		
		System.out.println(t[i]);
		
		


	}

}
