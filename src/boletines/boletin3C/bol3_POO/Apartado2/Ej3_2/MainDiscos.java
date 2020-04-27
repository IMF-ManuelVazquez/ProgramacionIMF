package boletines.boletin3C.bol3_POO.Apartado2.Ej3_2;

import java.util.Scanner;

public class MainDiscos {

	static ColeccionesDiscos coleccion = new ColeccionesDiscos();
	
	public static void main(String[] args) {
		Scanner entradaScanner_main = new Scanner(System.in);
		int seleccion = -1;
		do {
			System.out.println("1: Listar Discos");
			System.out.println("2: Añadir Disco");
			System.out.println("3: Retirar Disco");
			System.out.println("0: Salir");
			seleccion = entradaScanner_main.nextInt();
			
			switch (seleccion) {
			case 1:
				listarDiscos();
				break;
			case 2:
				ingresarDisco();
				break;
			case 3:
				retirarDisco();
				break;

			default:
				break;
			}
			
		}while(seleccion!=0);
		System.out.println("Fin menu");
		
	}
	
	public static void listarDiscos() {
		System.out.println(coleccion);
	}

	public static void ingresarDisco() {
		Scanner entradaScanner_ingreso = new Scanner(System.in);
		System.out.println("Dame nombre:");
		String nombre = entradaScanner_ingreso.nextLine();
		System.out.println("Dame titulo");
		String titulo = entradaScanner_ingreso.nextLine();
		System.out.println("Dame genero");
		String genero = entradaScanner_ingreso.nextLine();
		System.out.println("Dame duracion");
		int duracion = Integer.valueOf(entradaScanner_ingreso.nextLine());
		coleccion.annadirDisco(nombre, titulo, genero, duracion);
	}
		
	public static void retirarDisco() {
		Scanner entradaScanner_retirar = new Scanner(System.in);
		System.out.println("Codigo de disco a retirar");
		String codigo = entradaScanner_retirar.nextLine();
		coleccion.retirarDisco(codigo);
	}
	
}
