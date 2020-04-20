package boletines.boletin3C.bol3_POO.Apartado2.Ej3;

import java.util.Arrays;

//todo minusculas -- identificador de una variable objeto...  coleccion
// Si tiene el primer mayus  --  clase   Coleccion
// Todo mayusuclas --- constante         COLECCION

public class ColeccionDeDiscos {
	
	private final int NUMERO_DISCOS_MAXIMO = 10;
	private Disco[] coleccion = new Disco[NUMERO_DISCOS_MAXIMO]; 

	// Constructor default
	public ColeccionDeDiscos() {
		
	}
	
	private int obtenerPrimeraPosicionDisponible() {
//		int posicionDisponible=-1;
//		for (int i = 0; i < coleccion.length; i++) {
//			if (coleccion[i]==null && posicionDisponible==-1) {
//				posicionDisponible=i;
//			}
//		}
//		return posicionDisponible;
		
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i]==null) {
				return i;
			}
		}
		return -1;
	}
	
	public void annadirDisco(String autor, String titulo, String genero, int duracion) {
		
		int posicionDisponible = obtenerPrimeraPosicionDisponible();
		Disco newDisco = new Disco(autor, titulo, genero, duracion);
		coleccion[posicionDisponible] = newDisco;
		// coleccion[obtenerPrimeraPosicionDisponible()]= new Disco(autor, titulo, genero, duracion);
	}
	
	public void retirarDisco(String id) {
		for (int i = 0; i < coleccion.length; i++) {
			Disco obj = coleccion[i];
			if (obj != null) {
				if (obj.getCodigo().equals(id)) {
					coleccion[i]=null;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "ColeccionDeDiscos [coleccion=" + Arrays.toString(coleccion) + "]";
	}
	
	
	
	
	

}
