package lecciones.T3_ESTRUCTURAS_CONTROL;

import java.util.Arrays;

public class Array1DvsArrayList {

	public static void main(String[] args) {
		
		final int NUMERO_ELEMENTOS = 10;
		double[] array1D = new double[NUMERO_ELEMENTOS]; // [0,0,0,0,0,0,0,0]
		for (int i = 0; i < array1D.length; i++) {
			array1D[i]=-1;
		}

		System.out.println(Arrays.toString(array1D));
		
		for (int i = 0; i < array1D.length; i=i+2) {
			array1D[i] = 5.0;
			array1D[i+1] = 2.0;
		}
		
		System.out.println("V1: "+Arrays.toString(array1D));
		
		double[] vector2 = {1,2,3,4,5,6,7,8,9,10};
		
		
		// MULTIPLICAR array1D x vector2  Y EL RESULTADO GUARDARLO EN VECTOR2.
		
		vector2 = multiplicar2Vectores(array1D, vector2);
		double[] vectorMultiplicacion = multiplicar2Vectores(array1D, vector2);
		
		
		// OCPION1
		System.out.println(Arrays.toString(vectorMultiplicacion));
		// OPCION2
		System.out.println(Arrays.toString(multiplicar2Vectores(array1D, vector2)));
		
		
		System.out.println("RESULTADO");
		System.out.println("V1: "+Arrays.toString(array1D));
		System.out.println("V2: "+Arrays.toString(vector2));
		//  si no usaramos un tercer vector y quisieramos sustituir los datos del segundo, tendriamos que hacerlo con 2 for?
		
		System.out.println("El maximo: "+obtenerMaximo(vector2));
		
		int max = obtenerMaximo(vector2);
		System.out.println(max);
		
	}
	
	public static double[] multiplicar2Vectores(double[] v1, double[] v2) {
		double[] v3 = new double[v1.length];
		for (int i = 0; i < v1.length; i++) {
			v3[i] = v1[i]*v2[i];
		}
		return v3;
	}
	
	public static int obtenerMaximo(double[] v) {
		//int numMaximo = Integer.MIN_VALUE;
		double numMaximo = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i]>numMaximo) {
				numMaximo = v[i];
			}
		}
		return (int)numMaximo;
	}
	
	

}
