package lecciones.T3_ESTRUCTURAS_CONTROL;

import java.util.ArrayList;

public class ArrayListDouble {
	
	// [5.0, 2.0, 5.0, 2.0, 5.0, 2.0, 5.0, 2.0, 5.0, 2.0]

	public static void main(String[] args) {
		
		final int NUMERO_ELEMENTOS = 10;
		ArrayList<Double> arrList1 = new ArrayList<Double>();  // []
		ArrayList<Double> arrList2 = new ArrayList<Double>();  // []
		
		for (int i = 0; i < NUMERO_ELEMENTOS; i++) {
			arrList1.add(-1.0);
		}
		
		System.out.println(arrList1);
		System.out.println(arrList1.size());

		// i = 0  0<10  
		// i = 1  1<11
		// i = 2  2<12
//		for (int i = 0; i < arrList1.size(); i++) {
//			arrList1.add(-5.0);
//		}
		
		System.out.println(arrList1);
		for (int i = 0; i < arrList1.size(); i=i+2) {
			arrList1.set(i, 5.0);
			arrList1.set(i+1, 2.0);
		}
//		for (int i = 0; i < array1D.length; i=i+2) {
//			array1D[i] = 5.0;
//			array1D[i+1] = 2.0;
//		}
		
		System.out.println(arrList1);
		//double[] vector2 = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < NUMERO_ELEMENTOS; i++) {
			arrList2.add((double)i);
		}

		System.out.println("RESULTADO DE LAS LISTAS TRAS TANTO ROLLO");
		System.out.println("ArraList1 "+arrList1);
		System.out.println("ArraList2 "+arrList2);
	}
	
	public static double obtenerMaximo(ArrayList<Double> listInput) {
		double numMaximo = listInput.get(0);
		for (int i = 0; i < listInput.size(); i++) {
			if (listInput.get(i)>numMaximo) {
				numMaximo = listInput.get(i);
			}
		}
		return numMaximo;	
	}
	
	public static ArrayList<Double> multiplicar2Listas(ArrayList<Double> v1, ArrayList<Double> v2) {
		ArrayList<Double> v3 = new ArrayList<Double>();  // []
		for (int i = 0; i < v1.size(); i++) {
			v3.add(v1.get(i)*v2.get(i));
		}
		return v3;
	}
	
	
//	public static double[] multiplicar2Vectores(double[] v1, double[] v2) {
//		double[] v3 = new double[v1.length];
//		for (int i = 0; i < v1.length; i++) {
//			v3[i] = v1[i]*v2[i];
//		}
//		return v3;
//	}
	
	
	
//	public static int obtenerMaximo(double[] v) {
//		double numMaximo = v[0];
//		for (int i = 1; i < v.length; i++) {
//			if (v[i]>numMaximo) {
//				numMaximo = v[i];
//			}
//		}
//		return (int)numMaximo;
//	}

}
