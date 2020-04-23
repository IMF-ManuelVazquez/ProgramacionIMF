package boletines.boletin3C.bol3_POO.Apartado1.Ej8;

import java.util.Scanner;

public class ExpoCoches {
	
	static final int OCUPACION_MAXIMA_PRINCIPAL = 1000;
	static final int OCUPACION_MAXIMA_COMPRA_VENTA = 200;
	static final int OCUPACION_MAXIMA_VIP = 25;
	
	static GestionEntradas principal = new GestionEntradas(OCUPACION_MAXIMA_PRINCIPAL);
	static GestionEntradas compra_venta = new GestionEntradas(OCUPACION_MAXIMA_COMPRA_VENTA);
	static GestionEntradas VIP = new GestionEntradas(OCUPACION_MAXIMA_VIP);
	
	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int seleccion;
		int entradas;
		int zona;
		do {
			mostrarOpciones();
			seleccion = entradaEscaner.nextInt();
			if (seleccion==1) {
				mostrarEntradasDisponibles();
			}else if (seleccion==2) {
				mostrarZonas();
				zona = entradaEscaner.nextInt();
				System.out.println("Cuantas entradas????");
				entradas = entradaEscaner.nextInt();
				
				if (zona==1) {
					principal.vender(entradas);
				}else if (zona == 2) {
					compra_venta.vender(entradas);
				}else if (zona == 3) {
					VIP.vender(entradas);
				}else {
					System.out.println("Zona seleccionada incorrecta");
				}
			}else if (seleccion==3) {
				System.out.println("Salir");
			}else {
				System.out.println("Seleccion incorrecta");
			}
		}while(seleccion!=3);
		
	}
	
	public static void mostrarOpciones() {
		System.out.println("------------------------");
		System.out.println("Menu");
		System.out.println("1. Mostrar numero de entradas disponibles");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		System.out.println("------------------------");
	}
	
	public static void mostrarZonas() {
		System.out.println("*******************");
		System.out.println("Zonas");
		System.out.println("1. Zona principal");
		System.out.println("2. Zona compra-venta");
		System.out.println("3. VIP");
		System.out.println("*******************");
	}

	public static void mostrarEntradasDisponibles() {
		
		System.out.println("En la sala principal");
		System.out.println("Libres: "+principal.getNumEntradas() + "/"+ OCUPACION_MAXIMA_PRINCIPAL);
		
		System.out.println("En la sala compra_venta");
		System.out.println("Libres: "+compra_venta.getNumEntradas()+ "/"+ OCUPACION_MAXIMA_COMPRA_VENTA);
		
		System.out.println("En la sala VIP");
		System.out.println("Libres: "+VIP.getNumEntradas()+ "/"+ OCUPACION_MAXIMA_VIP);
		
	}
	
}
