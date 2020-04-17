package boletines.boletin3C.bol3_POO.Apartado2.Ej3;

import java.util.Scanner;

public class MainPrueba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ColeccionDeDiscos coleccion = new ColeccionDeDiscos();
		
		System.out.println(coleccion);
		
		String autor = "Manuel";  
		String titulo = "eldiscoVerano";
		String genero = "HardRock";
		int duracion = 40;
		
		coleccion.annadirDisco(autor, titulo, genero, duracion);
		System.out.println(coleccion);
		
		String autor2 = "Manuel2";  
		String titulo2 = "eldiscoVerano2";
		String genero2 = "HardRock2";
		int duracion2 = 33;
		
		coleccion.annadirDisco(autor2, titulo2, genero2, duracion2);
		
		System.out.println(coleccion);

	}

}
