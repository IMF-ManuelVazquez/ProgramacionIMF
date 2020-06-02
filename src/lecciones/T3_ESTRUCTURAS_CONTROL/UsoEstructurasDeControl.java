package lecciones.T3_ESTRUCTURAS_CONTROL;

import java.util.Arrays;

public class UsoEstructurasDeControl {

	public static void main(String[] args) {
		
		int value = 3;

		// IF
		if (value > 3) {
			System.out.println("Mayor que 3");
		}

		// IF-ELSE - 2 OPCIONES
		if (value>3) {
			System.out.println("Mayor que 3");
		} else {
			System.out.println("Menor o igual que 3");
		}

		// MAS DE 2 OPCIONES
		if (value>3) {

		}else {
			if (value<3) {

			}else {

			}
		}

		if (value>3) {

		}else if (value<3) {

		}else if (value==3) {

		}
		
		// SWITCH
		int notas = 5;
		switch (notas) {
		case 0:
			System.out.println("No se puede poner cero, sino 1");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("sUFCIENCITE");
			break;
		case 6:
			System.out.println("Bioen");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("sobre");
			break;

		default:
			break;
		}
		
		
		// ESTRUCTURA DE REPETICIÓN.
		
		// WHILE & DO..WHILE
		
		int valueWhile = 5;
		
		while (valueWhile>10) {  // MIENTRAS ESA TRUE HAGO EL BUCLE
			System.out.println("hola");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// FOR
		
		// [12,10,11,20]
		
		int[] v = {12,10,11,20,11};
		System.out.println(Arrays.toString(v));
		
		String[] v2  = {"hoal","adios"};
		
		for (int i = 0; i < v.length; i=i++) {
			String dato = v2[i];
			System.out.println(dato);
		}
		
		// i = 0    12
		// i = 2    11
		// i = 4   - none
		
		// FOREACH
		for (String dato : v2) {
			System.out.println(dato);
		}


	}

}
