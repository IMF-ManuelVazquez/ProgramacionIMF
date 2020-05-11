package boletines.boletin3C.bol7.ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2PreciosMain {
	
	static ArrayList<Double> precios = new ArrayList<Double>();
	
	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int seleccion = 0;
		do {
			
			System.out.println("Menu");
			System.out.println("1_NuevoPrecio");
			System.out.println("2_MostrarPrecios");
			System.out.println("3_EliminarPrecio");
			System.out.println("4_PrecioMedio");
			System.out.println("5_PrecioMaximo");
			System.out.println("6_PrecioMinimo");
			System.out.println("7_Salir");
			seleccion = entradaEscaner.nextInt();
			
			if (seleccion==1) {
				ingresarNuevoPrecio();
			}else if (seleccion==2) {
				mostrarPrecios();
			}else if (seleccion==3) {
				eliminarPrecio();
			}else if (seleccion==4) {
				precioMedio();
			}else if (seleccion==5) {
				precioMaximo();
			}else if (seleccion==6) {
				precioMinimo();
			}else if (seleccion==7) {
				System.out.println("Saliendo");
			}else {
				System.out.println("Opcion no contemplada");
			}
			
		}while (seleccion!=7);
		
	}
	
	public static void ingresarNuevoPrecio() {
		Scanner entradaEscaner2 = new Scanner(System.in);
		System.out.println("ingrese un precio (Double)");
		double precioAIngresar = entradaEscaner2.nextDouble();
		if (precioAIngresar>=0) {
			precios.add(precioAIngresar);
		}else {
			System.out.println("Precios negativos no son válidos");
		}
		
		System.out.println("Elementos totales: "+precios.size());
	}
	
	public static void mostrarPrecios() {
		System.out.println(precios);
	}
	
	public static void eliminarPrecio() {
		Scanner entradaEscaner2 = new Scanner(System.in);
		System.out.println("Los elementos son:");
		mostrarPrecios();
		System.out.println("¿que posicion desea eliminar");
		int seleccionEliminar = entradaEscaner2.nextInt();
		
		if (seleccionEliminar>=0 && seleccionEliminar<precios.size()) {
			precios.remove(seleccionEliminar);
		}else {
			System.out.println("Sorry, posicion no permitida");
		}
	}
	
	public static void precioMedio() {
		
		double sumador = 0;
		// Classic for
//		for (int i = 0; i < precios.size(); i++) {
//			sumador = sumador +  precios.get(i);
//		}
		
		// Foreach
		for (Double elementoColeccionPrecios : precios) {
			sumador = sumador +  elementoColeccionPrecios;
		}
		
		System.out.println("Sumador total : "+sumador);
		System.out.println("Media es: "+(sumador/precios.size()));
		
	}

	public static void precioMaximo() {
		double precioMax = 0;
		for (Double elementoColeccionPrecios : precios) {
			if (elementoColeccionPrecios>precioMax) {
				precioMax = elementoColeccionPrecios;
			}
		}
		System.out.println("El maximo es: "+precioMax);
	}
	
	public static void precioMinimo() {
		double precioMin = 222222;
		for (Double elementoColeccionPrecios : precios) {
			if (elementoColeccionPrecios<precioMin) {
				precioMin = elementoColeccionPrecios;
			}
		}
		System.out.println("El maximo es: "+precioMin);
	}
	
}

