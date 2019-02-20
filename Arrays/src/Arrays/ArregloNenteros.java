package Arrays;

import javax.swing.JOptionPane;

public class ArregloNenteros {

	public static void main(String[] args) {
		
		int i;		
		int[] valores = new int [10];

		for( i = 0;i < valores.length;i++){
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :"));	
		}


		for (i=0;i<=4;i++){
					
			System.out.println("Num " + valores[i] + "-" + valores[9 - i] );
	
		}
	}
}

	
