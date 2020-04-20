package boletines.boletin3C.bol1_ARRAYS1D.Ej3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3Arr {

	public static void main(String[] args) {
		
		Scanner entradaScaner = new Scanner(System.in);
		System.out.println("inicio del programa");
		int[] vector = new int[10];
		for (int i = 0; i < vector.length; i++) {
			System.out.println("introduzca num pos: "+i);
			vector[i] = entradaScaner.nextInt();
		}
		
		// Primera parte 3.1.
		
		System.out.println("Imprima al reves los datos");
		for (int i = vector.length-1; i >= 0; i--) {
			System.out.println(vector[i]);
		}
		
		// [1,2,3,4,5,6,7,8,9,10]
		// aux = 10
		// i = 0
		// [ , , , , , , , , ,1]
		// [10, , , , , , , , ,1] 
		
		// i = 1
		// aux = 9
		// [10, , , , , , , ,2,1]
		// [10,9, , , , , , ,2,1]
		
		for (int i = 0; i < (vector.length/2); i++) {
			int aux = vector[vector.length-1-i];
			vector[vector.length-1-i] = vector[i];
			vector[i] = aux;
		}
		
		System.out.println(Arrays.toString(vector));
			
		
		

	}

}
