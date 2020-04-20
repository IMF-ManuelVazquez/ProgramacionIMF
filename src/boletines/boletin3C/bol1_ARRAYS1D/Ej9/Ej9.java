package boletines.boletin3C.bol1_ARRAYS1D.Ej9;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int[] vector = new int[8];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("introduzca num posicion: "+i);
			vector[i]=entradaEscaner.nextInt();
		}
		
		System.out.println(Arrays.toString(vector));
		
		for (int i = 0; i < vector.length; i++) {
			if ((vector[i]%2)==1) {
				System.out.println("impar: "+vector[i]);
			}else {
				System.out.println("par: "+vector[i]);
			}
		}

	}

}
