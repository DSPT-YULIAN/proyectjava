package funciones;


import javax.swing.JOptionPane;

public class areacirculo {
	
	
	public static double globalradio = 0;
	public static double globalvolumen = 0;

	public static void main(String[] args) {

		
		globalradio = Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio"));
		

		globalradio = Math.PI * Math.pow(globalradio, 2);
		globalvolumen = (4.0/3.0) * Math.PI  *(Math.pow(globalradio, 3));
		

		System.out.println("El area del circulo es :"+ globalradio);   

		System.out.println("El volumen de la esfera es :"+ globalvolumen);   


	}

}
