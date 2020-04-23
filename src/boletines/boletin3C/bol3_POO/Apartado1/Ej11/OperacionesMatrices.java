package boletines.boletin3C.bol3_POO.Apartado1.Ej11;

public class OperacionesMatrices {
	
	
	// min 2  max 5      0 3    0 +2  3 +5    2 - 5
	
	public static int[][] generaArrayBiInt(int n, int m, int min, int max){
		
		int[][] matriz = new int[n][m];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int rango = max - min;
				matriz[i][j] = ((int)(Math.random()*(rango+1)))+min;
			}
		}
		return matriz;
	}
	
	public static int[] filaDeArrayBiInt (int[][]matriz, int fila) {
		return matriz[fila];
	}
	
	public static int[] columanDeArrayBiInt(int[][] matriz, int columna) {
		int numeroColumnasMatriz = matriz[0].length;
		int[] datosColumna = new int[matriz.length];
		
		if (columna<numeroColumnasMatriz) {
			for (int i = 0; i < matriz.length; i++) {
				datosColumna[i] = matriz[i][columna];
			}
		}else {
			System.out.println("Error fila columan solicitada incorrecta");
		}
		return datosColumna;
	}
	
	public static int[] coordenadasEnArrayBiInt(int[][] matriz, int value) {
		int[] coor = new int[2];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == value) {
					coor[0] = i;
					coor[1] = j;
					return coor;
				}
			}
		}
		return coor;
	}
	
	public static boolean esPuntoDeSilla(int[][] matriz, int fila, int col) {
		
		int value = matriz[fila][col];
		
		for (int i = 0; i < matriz[fila].length; i++) {
			if (value>matriz[fila][i]) {
				return false;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			if (value<matriz[i][col]){
				return false;
			}
		}
		
		return true;
	}
	
	
}
