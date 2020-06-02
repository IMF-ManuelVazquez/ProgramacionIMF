package lecciones.T4_ESTRUCTURAS_ALMACENAMIENTO;

import java.util.Arrays;

public class UsoArray1DVectores {

	public static void main(String[] args) {

		int[] array1D;
		
		array1D = new int[5];  // Definición de un array 1D --- [0, 0 , 0 ,0 ,0]
		final int NUMERO_ELEMENTOS_VECTOR = array1D.length;
		
		array1D[0] = 1;
		array1D[1] = 2;
		array1D[2] = 3;
		array1D[3] = 4;
		array1D[4] = 5;
		
		int contador = 0;
		while (contador < array1D.length) {
			array1D[contador] = contador+1;
			contador++;
		}  
		
		for (int i = 0; i < array1D.length; i++) {
			array1D[i] = i+1;
		}
		
		String[] listadoNombres = new String[5];
		for (int i = 0; i < array1D.length; i++) {
			listadoNombres[i] = String.valueOf(i+1);
		}

		
		System.out.println("Array1D de Enteros");
		System.out.println(Arrays.toString(array1D));
		
		System.out.println("Array1D de STRING");
		System.out.println(Arrays.toString(listadoNombres));
		
		
		//boolean[] array1DBoolean = new boolean[5]; //   [false,false,false,false,false]   false == 0   &&  true == 1
		
	}

}
