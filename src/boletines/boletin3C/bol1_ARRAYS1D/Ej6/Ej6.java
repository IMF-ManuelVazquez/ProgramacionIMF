package boletines.boletin3C.bol1_ARRAYS1D.Ej6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		Scanner entradaScanner = new Scanner(System.in);
		
		
		
		int[] v = new int[15];
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduzca el num de la posicion: "+i);
			v[i]=entradaScanner.nextInt();
		}
		
		
		
		System.out.println(Arrays.toString(v));
		
		// [1,2,3,4,5]
		// [5,1,2,3,4]
		
		int aux = v[v.length-1];
		
		for (int i = v.length-1; i >0; i--) {
			v[i]= v[i-1];
		}
		v[0]= aux;
		
		System.out.println(Arrays.toString(v));
	}

}
