package boletines.boletin3C.bol1_ARRAYS1D.Ej11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		final int NUMERO_ELEMENTOS = 10;
		int[] vector = new int[NUMERO_ELEMENTOS];
		int[] aux = new int[NUMERO_ELEMENTOS];
		int contador_aux = 0;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca un numero en la posición: "+i);
			vector[i] = entradaEscaner.nextInt();
		}
		
		System.out.println("Imprimir vector original");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(i+": "+vector[i]);
		}
		
		for (int i = 0; i < vector.length; i++) {
			if (esPrimo(vector[i])){
				aux[contador_aux] = vector[i];
				contador_aux++;
			}
		}
		
		for (int i = 0; i < vector.length; i++) {
			if (!esPrimo(vector[i])){
				aux[contador_aux] = vector[i];
				contador_aux++;
			}
		}
		
		System.out.println("Imprimir vector ordenado");
		for (int i = 0; i < aux.length; i++) {
			System.out.println(i+": "+aux[i]);
		}

		
	}

	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

}
