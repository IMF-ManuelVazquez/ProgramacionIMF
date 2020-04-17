package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class ColeccionDeDiscos {
	
	Scanner entradaEscaner;
	private Disco[] coleccion = new Disco[10];
	private int numeroDiscosIntroducidos = 0;
	
	public void annadirDisco() {
		
		entradaEscaner = new Scanner(System.in);
		
		System.out.println("Metodo añadir disco");
		System.out.println("usuario dame el autor:");
		String autor = entradaEscaner.nextLine();
		
		System.out.println("usuario dame el titulo:");
		String titulo = entradaEscaner.nextLine();
		
		System.out.println("usuario dame el genero:");
		String genero = entradaEscaner.nextLine();
		
		System.out.println("usuario dame el duracion:");
		int duracion = entradaEscaner.nextInt();
		
		Disco disco = new Disco(autor, titulo, genero, duracion);
		coleccion[numeroDiscosIntroducidos] = disco;
		numeroDiscosIntroducidos++;
		
	}
	
	public void eliminarDisco() {
		
		entradaEscaner = new Scanner(System.in);
		System.out.println("usuario dime que disco quieres elminar a traves codigo");
		String codigo = entradaEscaner.nextLine();
		
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i]!=null) {
				if (coleccion[i].getCodigo().equals(codigo)) {
					coleccion[i] = null;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "ColeccionDeDiscos [coleccion=" + Arrays.toString(coleccion) + ", numeroDiscosIntroducidos="
				+ numeroDiscosIntroducidos + "]";
	}
	
	
}
