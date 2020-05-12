package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		try {
			muestraArray();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("vaya");
		}
	}
	
	public static void muestraArray() {
		int[] arr = {1,2,3};
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("que dato quiere acceder: ");
		int seleccion = entrada.nextInt();
		System.out.println("Dato: "+arr[seleccion]);
			
	}
	
	
}



