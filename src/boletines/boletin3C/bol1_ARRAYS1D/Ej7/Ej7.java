package boletines.boletin3C.bol1_ARRAYS1D.Ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
	
	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int[] vector = new int[100];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]= (int)(Math.random()*21);
		}
		
		//System.out.println(Arrays.toString(vector));
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			System.out.print(" ");
		}
		System.out.println("");
		
		
		System.out.println("Introduzca numero1");
		int num1 = entradaEscaner.nextInt();
		
		System.out.println("Introduzca numero2");
		int num2 = entradaEscaner.nextInt();
		
		
		// 12 19 17 15 3 10 12 12 16 13
		// num1 = 3      num2 = 6
		// 12 19 17 15 "6" 10 12 12 16 13
		
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]==num1) {
				System.out.print("\""+num2+"\"");
			}else {
				System.out.print(vector[i]);
			}
			System.out.print(" ");
		}
		
	}

}
