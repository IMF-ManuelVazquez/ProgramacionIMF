package boletines.boletin3C.bol1_ARRAYS1D.Ej14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej14 {
	final static int OCUPACION_MAXIMA = 4;
	final static int NUMERO_MESAS = 10;
	
	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int[] mesas = new int[NUMERO_MESAS];
		mostrarOcupacion(mesas);
		for (int i = 0; i < mesas.length; i++) {
			mesas[i]=(int)(Math.random()*(OCUPACION_MAXIMA+1));
		}
		mostrarOcupacion(mesas);
		
		int grupo;
		do {
			System.out.print("¿Cuantos son? (-Introduzca -1 para salir): ");
			grupo = entradaEscaner.nextInt();
			if (grupo>OCUPACION_MAXIMA) {
				System.out.println("No hay mesas para ese nuemo de grupo");
			}else {
				int mesaVacia = encontrarMesaVacia(mesas);
				if (mesaVacia!=-1) {
					System.out.println("Por favor, sientese en la mesa: "+mesaVacia);
					mesas[mesaVacia] = grupo;
				}else {
					int mesaDisponible = encontrarMesaDisponible(mesas, grupo);
					if (mesaDisponible!=-1) {
						System.out.println("Tendra que compartir. En la mesa: "+mesaDisponible);
						mesas[mesaDisponible] = mesas[mesaDisponible]+grupo;
					}else {
						System.out.println("Lo siento en estos momentos no queda sitio");
					}
				}
			}
			mostrarOcupacion(mesas);
		}while (grupo!=-1);
		
		System.out.println("Fin del programa");
		

	}
	
	public static int encontrarMesaVacia(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]==0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int encontrarMesaDisponible(int[] vector, int grupo) {
		for (int i = 0; i < vector.length; i++) {
			if ((vector[i]+grupo)<=OCUPACION_MAXIMA) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void mostrarOcupacion(int[] vector) {
		System.out.print("Mesas nº  ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print("|  ");
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println("|");
		
		System.out.print("Ocupacion ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print("|  ");
			System.out.print(vector[i]);
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.println("------------------------------------------");
	}
}
