package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Persona;

import java.util.Arrays;

public class MainPersona {

	public static void main(String[] args) {

		int[] valorRetornado = retonarDosNumeros();
		System.out.println(Arrays.toString(valorRetornado));
		int suma = valorRetornado[0]+valorRetornado[1];
		System.out.println(suma);

	}
	
	public static int[] retonarDosNumeros() {
		int num1 = 3;
		int num2 = 4;
		
		int[] out = {num1,num2};
		
		return out;
	}

}
