package boletines.boletin3C.bol3_POO.Apartado1.Ej11;

import java.util.Arrays;

public class MainOperacionesMatrices {

	public static void main(String[] args) {
		
		boolean encontrado = false;
		do {
			System.out.println("generarArray");
			int[][] arrGenerado = OperacionesMatrices.generaArrayBiInt(4, 4, 5, 20);
			
			System.out.println(Arrays.deepToString(arrGenerado));
			
			int[] fila2 = OperacionesMatrices.filaDeArrayBiInt(arrGenerado, 2);
			System.out.println(Arrays.toString(fila2));
			
			int[] columna2 = OperacionesMatrices.columanDeArrayBiInt(arrGenerado, 3);
			System.out.println(Arrays.toString(columna2));
			
			int[] coor = OperacionesMatrices.coordenadasEnArrayBiInt(arrGenerado, 10);
			System.out.println("Coordenadas: "+Arrays.toString(coor));
			
			System.out.println("Es punto de silla fila 2 columan 3");
			
			encontrado = OperacionesMatrices.esPuntoDeSilla(arrGenerado, 2, 3);
			System.out.println(encontrado);
		}while (encontrado==false);
		
		

	}

}
