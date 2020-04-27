package boletines.boletin3C.bol3_POO.Apartado2.Ej3_2;

import java.util.Arrays;

public class ColeccionesDiscos {
	
	private final int NUMERO_ELEMENTOS = 10;
	private Disco[] coleccion = new Disco[NUMERO_ELEMENTOS];
	
	// [obj, null, null, null, null , null, null, null, null , null, null]
	
	private int posicionDisponible() {
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i]==null) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean annadirDisco(String autor, String tituo, String genero, int duracion) {
		
		if (posicionDisponible()>=0) {
			// Disco disco = new Disco(autor, tituo, genero, duracion);
//			// coleccion[posicionDisponible()] = disco;
			coleccion[posicionDisponible()] = new Disco(autor, tituo, genero, duracion);
			return true;
		}else {
			System.out.println("Coleccion llena");
			return false;
		}
		
	}
	
	public boolean retirarDisco(String codigo) {
		
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] !=null) {
				if (coleccion[i].getCodigo().equals(codigo)) {
					coleccion[i] = null;
					return true;
				}
			}
		}
		
		System.out.println("Disco no encontrado");
		return false;
		
	}

	@Override
	public String toString() {
		return "ColeccionesDiscos [coleccion=" + Arrays.toString(coleccion) + "]";
	}
	
	

}
