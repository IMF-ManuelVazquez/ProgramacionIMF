package lecciones.T8_COLECCIONES_DE_DATOS.VideoLeccion;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Opel");
		System.out.println(cars.size());
		
		// Para obtener un dato de la colección
		//System.out.println(cars.get(1));
		
		// Para modificar un dato
		cars.set(1, "KIA");
		
		System.out.println(cars.get(1));
		
		// Eliminar un elemento de la coleccion
		cars.remove(1);
		
		System.out.println(cars.get(1));
		
		// Tamaño del arrayList de la coleccion
		System.out.println(cars.size());
		
		// contains... si un elemento que yo busque
		System.out.println(cars.contains("Ford"));
		System.out.println(cars.contains("Opel"));
		
		// IndexOf
		System.out.println(cars.indexOf("Ford"));
		System.out.println(cars.indexOf("Opel"));
		
		
		// Recorrer la coleccion
		System.out.println("for normal");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("for each");
		for (String strCar : cars) {
			System.out.println(strCar);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		cars.set(44, "Mercedes");
		
		
		
		
		
		
	}

}
