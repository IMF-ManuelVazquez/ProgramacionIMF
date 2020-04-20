package boletines.boletin3C.bol1_ARRAYS1D.Ej13;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
	
		Scanner entradaEscaner = new Scanner(System.in);
		final int NUMERO_ELEMENTOS = 100;
		final int RANGO_SUPERIOR_ALEATORIO = 500;
		int[] vector = new int[NUMERO_ELEMENTOS];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*(RANGO_SUPERIOR_ALEATORIO+1));
		}
		
		System.out.println(Arrays.toString(vector));
		System.out.print("¿Que quiere destacar? 1- min, 2 - max: ");
		int seleccion = entradaEscaner.nextInt();
		if (seleccion==1) { // minimo
			int numeroADestacar = calcularMinimoArr(vector, RANGO_SUPERIOR_ALEATORIO);
			mostrarElementosDestacandoNumero(vector, numeroADestacar);
		}else if (seleccion==2) {  // max
			int numeroADestacar = calcularMaxArr(vector, 0);
			mostrarElementosDestacandoNumero(vector, numeroADestacar);
		}else {
			System.out.println("selccion incorrecta");
		}
		
	}
	
	public static int calcularMinimoArr(int[] v, int rangoMax) {
		int min = rangoMax+1;  // 501
		for (int i = 0; i < v.length; i++) {
			if (v[i]<min) {
				min = v[i];
			}
		}
		return min;
	}
	
	public static int calcularMaxArr(int[] v, int rangoMin) {
		int max = rangoMin-1;  // -1
		for (int i = 0; i < v.length; i++) {
			if (v[i]>max) {
				max = v[i];
			}
		}
		return max;
	}
	
	public static void mostrarElementosDestacandoNumero(int[] v, int numADestacar) {
		for (int i = 0; i < v.length; i++) {
			if (v[i]==numADestacar) {
				System.out.print("**"+v[i]+"**");
			}else {
				System.out.print(v[i]);
			}
			System.out.print(" ");
		}
	}
}
