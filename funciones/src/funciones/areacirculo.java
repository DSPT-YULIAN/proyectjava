package funciones;

import javax.swing.JOptionPane;

public class areacirculo {
	
	public  static  double globalradio =  0 ;
	public  static  double globalvolumen =  0 ;
	
	
	
	public static void main(String[] args) {

		double area,volumen;
		
		globalradio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio"));  
		
		area = CalcularArea(globalradio);
		volumen = CalcularVolumen (globalvolumen);
			
		System.out.println("El area del circulo es :"+ area);   

		System.out.println("El volumen de la esfera es :"+ volumen);  
	}
	
	public static double CalcularArea (double globalradio) {
		
		double area =  Math.PI * Math.pow(globalradio, 2);
		return area;
				
		
	}

	public static double CalcularVolumen (double globalvolumen) {
		
		double volumen =  (4.0/3.0) * Math.PI  *(Math.pow(globalradio, 3));
		return volumen;
	
}

}