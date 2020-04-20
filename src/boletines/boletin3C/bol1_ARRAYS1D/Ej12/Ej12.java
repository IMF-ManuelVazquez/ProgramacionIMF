package boletines.boletin3C.bol1_ARRAYS1D.Ej12;

import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		final int NUMERO_ELEMENTOS = 10;
		int[] vector = new int[NUMERO_ELEMENTOS];
		for (int i = 0; i < vector.length; i++) {
			System.out.println("ingrese en la posicion: "+i);
			vector[i]= entradaEscaner.nextInt();
		}
		
		System.out.println("Imprimir vector original");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(i+": "+vector[i]);
		}
		
		int numInit;
		int numFin;
		do {
			System.out.println("ingrese el inicio");
			numInit = entradaEscaner.nextInt();
			System.out.println("ingrese el final");
			numFin = entradaEscaner.nextInt();
		}while(comprobacionNumeros(numInit,numFin)==false);
		
//		int[] vector = {20,5,7,4,32,9,2,14,11,6};
//		int numInit = 3;
//		int numFin= 7;
		
		System.out.println("Numeros finales:");
		System.out.println("Num init: "+numInit);
		System.out.println("Num Fin: "+numFin);
		
//		int aux = vector[3];
//		vector[3] = vector[2];
//		vector[2] = vector[1];
//		vector[1] = vector[0];
//		vector[0] = vector[9];
//		vector[9] = vector[8];
//		vector[8] = vector[7];
//		vector[7] = aux; 
		
		int aux = vector[numInit]; 
		int pos = numInit;
		do {
			pos--;
			if (pos<0) {
				pos = vector.length-1;
				vector[0] = vector[pos];
			}else {
				vector[pos+1] = vector[pos];
			}
		}while (pos!=numFin);
		vector[pos] = aux;
		
		System.out.println(Arrays.toString(vector));
		
	}
	
	public static boolean comprobacionNumeros(int numInit, int numFin) {
		if (numInit<numFin) {
			if ((numInit>=0 && numInit<10) && (numFin>=0 &&numFin<10)) {
				return true;
			}
		}
		return false;
	}

}
