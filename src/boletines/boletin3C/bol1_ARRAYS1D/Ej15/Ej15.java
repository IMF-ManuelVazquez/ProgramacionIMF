package boletines.boletin3C.bol1_ARRAYS1D.Ej15;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		final int MAXIMO_NOTAS = 50;
		int[] notas = new int[MAXIMO_NOTAS];
		
		int contador = 0;
		int aux = 0;
		do {
			System.out.println("Introduzca la nota "+(contador+1)+"/"+MAXIMO_NOTAS);
			aux = entradaEscaner.nextInt();
			if (aux>=0 && aux <=10) {
				if (aux>=0) {
					notas[contador] = aux;
					contador++;
				}
			}
		}while (contador<MAXIMO_NOTAS && aux!=-1);
	
		System.out.println(Arrays.toString(notas));
		
		System.out.println("MEDIA: "+getMediaNotas(notas,contador));
	}
	
	public static String getMediaNotas(int[] notas, int contador) {
		System.out.println("Insertadas "+contador+" notas");
		System.out.println("Calculando media");
		int sumador=0;
		for (int i = 0; i < notas.length; i++) {
			sumador=sumador+notas[i];
		}
		System.out.println("sumador: "+sumador);
		System.out.println("contador: "+contador);
		double media =((double)sumador/(double)contador);
		
		System.out.println("antes del formateo: "+media);
		DecimalFormat formateador = new DecimalFormat("####.##");
		return formateador.format(media);
	}

}
