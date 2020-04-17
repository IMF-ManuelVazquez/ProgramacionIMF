package boletines.boletin3C.bol3_POO.Apartado2.Ej2;

import java.util.*;

public class ManejoVectores {


	
	
	//Genera un array de tamaño n con numeros aleatorios cuyo intervalo(minimo y Maximo) se indica por parametro.
	public static int[] generarArrayInt() {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int[] array = new int[x];
		int min = minimoArrayInt();
		int max = maximoArrayInt();
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*(max-min+1)+min);
		}
		sc.close();
		return array;
	}
	//Devuelve el minimo del array del array que se pasa como parametro
	private static int minimoArrayInt() {
		Scanner sc2=new Scanner(System.in);
		int x = sc2.nextInt();
		sc2.close();
		return x;
	}
	//devuelve el maximo del array que se pasa como parametro
	private static int maximoArrayInt() {
		Scanner sc3=new Scanner(System.in);
		int x = sc3.nextInt();
		sc3.close();
		return x;
	}
	//Devuelve la media del array quese pasa como parametro
	public static int mediaArrayInt(int[] array) {
		int x=0;
		for (int i = 0; i < array.length; i++) {
			x += array[i];
		}
		x= x/array.length;
		return x;
	}
	//Dice si un numero esta o no dentro de un array
	public static boolean estaEnArrayInt(int[] array, int num) {
		boolean esta=false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==num) {
				esta = true;
			}
		}
		return esta;
	}
	//Busca un numero es un array y devuelve la posicion (el indice) en la que se encuentra.
	public static int posicionEnArray(int[] array,int num) {
		int donde = -1;
		int contador=0;
		int encontrado=0;
		do {
			if(array[contador]==num) {
				donde=contador;
				encontrado=1;
			}
			contador++;
		} while (contador!=(array.length-1)&&(encontrado!=1));

		return donde;
	}
	//Le da la vuelta a un array
	public static int[] volteaArrayInt(int[] array) {
		int[] alReves=new int[array.length];
		int descendente=(array.length)-1;
		int ascendente=0;
		do {
			alReves[ascendente]=array[descendente];
			ascendente++;
			descendente--;
		} while (ascendente!=array.length);
		return alReves;
	}

	//Rota n posiciones a la derecha los numeros del array
	public static int[] rotaDerechaArrayInt(int[] array,int num) {
		int desde=num;
		int contador=0;
		int[] arrayMovido =new int[array.length];
		do {
			arrayMovido[desde]=array[contador];
			desde++;
			contador++;
			if (desde==array.length) {
				desde=0;
			}

		} while (desde!=num);
		return arrayMovido;
	}
	//Rota n posiciones a la izquierda los numeros del array
	public static int[] rotaIzquierdaArrayInt(int[] array,int num){
		int desde=num;
		int contador=0;
		int[] arrayMovido =new int[array.length];
		do {
			arrayMovido[contador]=array[desde];
			desde++;
			contador++;
			if (desde==array.length) {
				desde=0;
			}

		} while (desde!=num);
		return arrayMovido;
	}
}
