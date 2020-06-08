package boletines.boletin3C.bol1_ARRAY1D_2.ej14;

import java.util.Arrays;
import java.util.Scanner;

public class DistribucionMesas {
	static final int TAMANNO_MESAS = 4;
	
	public static void main(String[] args) {
		
		final int NUMERO_MESAS_TOTALES = 10;
		
		int[] mesas = new int [NUMERO_MESAS_TOTALES];  
		
		mesas = distribucionInicialMesasPrueba(mesas);
		
		System.out.println(Arrays.toString(mesas));
		imprimirDistribucionMesas(mesas);
		
		int salir = 0;
		do {
			
			try {
				
				int numeroComensales = preguntarNumeroUsuarios();
				System.out.println("FIN: "+ numeroComensales);
				
				int mesaVacia = buscarMesaVacia(mesas);
				System.out.println("MesaVacia: "+(mesaVacia+1));
				
				if (mesaVacia==-1) {
					int mesaDisponible = buscarMesaHastaLlenar(mesas, numeroComensales);
					if (mesaDisponible==-1) {
						System.out.println("No entrais lo siento buscar otro restaurante");
					}else {
						mesas[mesaDisponible] = mesas[mesaDisponible] + numeroComensales;
						imprimirDistribucionMesas(mesas);
					}
				}else {
					mesas[mesaVacia] = numeroComensales;
					imprimirDistribucionMesas(mesas);
				}
				
				System.out.println("Quieres salir? Pulse 1");
				Scanner entradaEscanner = new Scanner(System.in);
				salir = entradaEscanner.nextInt();
				
			}catch (ArrayIndexOutOfBoundsException e) {
				salir=-1;
			}finally {
				System.out.println("esto lo hace si o si.");
			}
	
		}while (salir==0);
		
		
	}
	
	public static int[] distribucionInicialMesasPrueba(int[] mesas) {
		mesas[0]=3;
		mesas[1]=2;
		mesas[3]=2;
		mesas[4]=4;
		mesas[5]=1;
		mesas[7]=2;
		mesas[8]=1;
		mesas[9]=1;
		return mesas;
	}
	
	public static int buscarMesaHastaLlenar(int[]mesas, int numeroComensales) {
		
		for (int i = 0; i < mesas.length; i++) {
			if ((TAMANNO_MESAS-mesas[i])>=numeroComensales) {
				return i;
			}
		}
		return -1;
	}
	
	public static int buscarMesaVacia(int[] mesas) {
		
		for (int i = 0; i < mesas.length; i++) {
			if (mesas[i]==0) {
				return i;
			}
		}
		return -1;
		
	}
		
	public static int preguntarNumeroUsuarios() {
		Scanner entradaScanner = new Scanner(System.in);
		int num=0;
		
		do {
			System.out.println("¿ Cuantos sois ?");
			num = entradaScanner.nextInt();
			if (num>4) {
				System.out.println("Lo siento no admitimos gurpos de "+ num+" haga grupos de 4 como máximo e intente de nuevo");
			}else if (num<=0) {
				System.out.println("Lo siento no admito numeros negativos o igual a zero");
			}	
		}while (num>4 || num<=0);  // sera falso y saldara del while  cuando: num <=4
		
		return num;
	}
	
	public static void imprimirDistribucionMesas(int[] mesas) {
		
		System.out.println("***************************************************");
		System.out.println("**********   DISTRIBUCION DE LAS MESAS ************");
		System.out.println("***************************************************");
		System.out.print("Mesas nº:  ");
		for (int i = 0; i < mesas.length; i++) {
			System.out.print( " | ");
			System.out.print(i+1);
		}
		System.out.println( " | ");
		System.out.print("Ocupacion: ");
		for (int i = 0; i < mesas.length; i++) {
			System.out.print( " | ");
			System.out.print(mesas[i]);
		}
		System.out.println( "  | ");
		System.out.println("***************************************************");
		
	}

}
