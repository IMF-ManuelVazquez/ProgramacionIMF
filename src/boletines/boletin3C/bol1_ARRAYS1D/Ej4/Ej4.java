package boletines.boletin3C.bol1_ARRAYS1D.Ej4;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int)(Math.random()*101);
		}
		
		System.out.println(Arrays.toString(numero));
		
		for (int i = 0; i < cuadrado.length; i++) {
			//cuadrado[i] = numero[i]*numero[i]; //x^2 = x*x
			cuadrado[i] = (int) Math.pow(numero[i], 2);
		}

		for (int i = 0; i < cubo.length; i++) {
			//cubo[i] = numero[i]* numero[i] * numero[i];
			cubo[i] = (int) Math.pow(numero[i],3);
		}
		
		System.out.println(Arrays.toString(numero));
		System.out.println(Arrays.toString(cuadrado));
		System.out.println(Arrays.toString(cubo));
		
	}

}
