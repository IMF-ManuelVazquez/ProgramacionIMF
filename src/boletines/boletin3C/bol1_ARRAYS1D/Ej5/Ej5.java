package boletines.boletin3C.bol1_ARRAYS1D.Ej5;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	
	public static void main(String[] args) {
		
		Scanner entradaScanner = new Scanner(System.in);
		
		int[] num = new int[10];
		System.out.println("introduzca los nums");
		for (int i = 0; i < num.length; i++) {
			System.out.println("num en la posicion: "+i);
			num[i] = entradaScanner.nextInt();
		}
		
		// Opcion1
		int max = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max = num[i];
			}
		}
		
		int min = 999999; // Valor muy grande
		for (int i = 0; i < num.length; i++) {
			if (num[i]<min) {
				min = num[i];
			}
		}
		
		// Opcion2
		int[] aux = Arrays.copyOf(num, num.length);
		Arrays.sort(aux);
		System.out.println("Ordenada sería: "+Arrays.toString(aux));
		int min2 = aux[0];
		int max2 = aux[aux.length-1];
		
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]==min) {
				System.out.println("minimo ("+num[i]+")");
			}else if (num[i]==max) {
				System.out.println("maximo ("+num[i]+")");
			}else {
				System.out.println(num[i]);
			}
		}
		
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
	}

}
