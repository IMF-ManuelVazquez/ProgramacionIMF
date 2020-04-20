package boletines.boletin3C.bol1_ARRAYS1D.Ej10;

import java.util.Arrays;

public class Ej10 {
	
	public static void main(String[] args) {
		
		int[] vector =  new int[20];
		int[] aux = new int[vector.length];
		int contador_aux = 0;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*101);
		}
		
		System.out.println(Arrays.toString(vector));
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==0) {
				aux[contador_aux] = vector[i];
				contador_aux++;
			}
		}
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==1) {
				aux[contador_aux] = vector[i];
				contador_aux++;
			}
		}
		
		System.out.println(Arrays.toString(aux));
		
	}

}
