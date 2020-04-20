package boletines.boletin3C.bol1_ARRAYS1D.Ej8;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int[] temperaturas = new int[12];
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("La temperatura media para el mes: "+(i+1));
			temperaturas[i]=entradaEscaner.nextInt();
		}
		
		System.out.println(Arrays.toString(temperaturas));
		
		// [22,25,20,26,27,28,30,26,27,28,30,19]

		for (int i = 0; i < temperaturas.length; i++) {
			
			System.out.print(" temperatura "+(i+1)+": ");
			for (int j = 0; j < temperaturas[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
			//System.out.println(" temperatura "+(i+1)+ " es "+temperaturas[i]);
		}
		
		
		
	}
}
