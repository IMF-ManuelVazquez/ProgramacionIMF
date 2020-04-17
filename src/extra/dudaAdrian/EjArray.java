package extra.dudaAdrian;

import java.util.Arrays;

public class EjArray {

	public static void main(String[] args) {
		
		int[] v = {1,2,3,4,5};
		
		rotaDerechaArrayInt(v,1);
		
		
		System.out.println(Arrays.toString(v));
	}
	
	public static void rotaDerechaArrayInt(int[] vector, int n) {
		int contador = 0;
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		
		do {
			int aux = vector[vector.length-1];
	        for (int i=0;i<vector.length-1;i++) {
	            vector[i+1] = vector[i];
	        }
	        vector[0] = aux;
	        contador++;
	        System.out.println(contador);
		}while (contador < n);
	}

}
