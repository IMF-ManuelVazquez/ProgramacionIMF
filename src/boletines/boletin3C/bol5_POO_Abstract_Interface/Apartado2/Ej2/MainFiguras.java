package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej2;

import java.util.ArrayList;

public class MainFiguras {

	public static void main(String[] args) {
		
		// Estan definidas como interfazFigura pero diferente forma = POLIMORFISMO.
		Cuadrado cuadrado = new Cuadrado(10);
		Triangulo triangulo = new Triangulo(10, 20);
		Rectangulo rectangulo = new Rectangulo(20, 10);
		
		//mostrarDatos(cuadrado);
		mostrarDatos(triangulo);
		//mostrarDatos(rectangulo);
		
//		System.out.println("Cuadrado");
//		System.out.println(cuadrado.calcularArea());
//		System.out.println(cuadrado.calcularPerimetro());
//
//		System.out.println("rectangulo");
//		System.out.println(rectangulo.calcularArea());
//		System.out.println(rectangulo.calcularPerimetro());
//		
//		System.out.println("triangulo");
//		System.out.println(triangulo.calcularArea());
//		System.out.println(triangulo.calcularPerimetro());
		
//		InterfazFigura[] listadoFiguras = new InterfazFigura[3];
//		listadoFiguras[0] = new Cuadrado(10);
//		listadoFiguras[1] = new Triangulo(10, 20);
//		listadoFiguras[2] = new Rectangulo(20, 10);
//		
//		for (int i = 0; i < listadoFiguras.length; i++) {
//			System.out.println("Figura posicion: "+i);
//			System.out.println(listadoFiguras[i].calcularArea());
//			System.out.println(listadoFiguras[i].calcularPerimetro());
//		}
		
		ArrayList<InterfazFigura> coleccion = new ArrayList<InterfazFigura>();
		coleccion.add(rectangulo);
		coleccion.add(cuadrado);
		coleccion.add(triangulo);

	}
	
	public static void mostrarDatos(InterfazFigura figura) {
		System.out.println(figura.calcularArea());
		System.out.println(figura.calcularPerimetro());
	}

}
