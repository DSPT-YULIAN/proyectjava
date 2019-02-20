package Arrays;

import java.util.Scanner;

public class ArreglosTablas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a[], b[], c[];
		int i,j;
		a=new int[12];
		b=new int[12];
		
		c = new int [24];
		
		
		System.out.println("Leyendo la tabla a");
		for (i=0;i<12;i++){
		System.out.print("número: ");
		a[i]= entrada.nextInt();
		}
		
		
		System.out.println("Leyendo la tabla b");
		for (i=0;i<12;i++){
		System.out.print("número: ");
		b[i]= entrada.nextInt();
		}
	
		j=0;
		i=0;
		
		while (i<12)
		{
		
			
		for (int k=0;k<3; k++)
		{
		c[j]=a[i+k];
		j++;
		}

		for (int k=0;k<3;k++)
		{
		c[j]=b[i+k];
		j++;
		}

		i+=3;

		}
		System.out.println("La tabla c queda: ");
		for (j=0;j<24;j++) 
		System.out.print(c[j]+" ");
		System.out.println("");


	}

}
