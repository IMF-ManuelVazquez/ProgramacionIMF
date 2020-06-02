package lecciones.T4_ESTRUCTURAS_ALMACENAMIENTO;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class EjercicioVector {

	public static void main(String[] args) {
		
//		final int NUMERO_ELEMENTOS = 10;
//		int[] vector = new int[NUMERO_ELEMENTOS];  // [0,0,0,0,0,0,0,0,0]
//		
//		System.out.println(Arrays.toString(vector));
//		
//		for (int i = 0; i < vector.length/2; i++) { 
//			vector[i*2] = i;
//			vector[(i*2)+1] = ((vector.length/2)-1)-i;
//		}
//		
//		System.out.println(Arrays.toString(vector));
		
		
		//String[] nombres = {"Cesar","Andrei","Alfredo","HeleM","Dalwin"};
		String[] nombres = new String[5];
		nombres[0] = "Cesar";
		nombres[1] = "Andrei";
		
		System.out.println(nombres.length);
		System.out.println(Arrays.toString(nombres));
		
		
		String buscado = "CEsar";

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i]!=null) {
				if (nombres[i].toLowerCase().equals(buscado.toLowerCase())) {   // "Helem" >> "helem" >> Equals helem
					System.out.println(i);
				}
			}
		}
		
		
		//		
//		int contador = 0;
//		for (String nombre : nombres) {
//			if (nombre.equals(buscado)) {
//				System.out.println("posicionCotnador: "+contador);
//			}
//			contador++;
//		}
		
		

	}

}
