package boletines.boletin5.ej10;

import java.util.Arrays;

public class Pila {
	
	private final int NUMERO_ELEMENTOS = 10;
	private String[] buffer;
	//private Persona[] bufferPersonas;

	public Pila() {
		this.buffer = new String[NUMERO_ELEMENTOS];
	}

	@Override
	public String toString() {
		return "Ej10Pila [buffer=" + Arrays.toString(buffer) + "]";
	}
	
	public void inicializarPila() {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i]="*";
		}
	}
	
	public int longitudPila() {
		int posConDato = 0;
		for (int i = 0; i < this.buffer.length; i++) {
			if (!this.buffer[i].equals("*")) {
				posConDato=i+1;
			}
		}
		return posConDato;
	}
	
	public boolean estaLlenaPila() {
		// OPCION1
		if (longitudPila()==NUMERO_ELEMENTOS) {
			return true;
		}else {
			return false;
		}
		//OPCION2
//		boolean vacio = true;
//		for (int i = 0; i < this.buffer.length; i++) {
//			if (this.buffer[i].equals("*")) {
//				vacio=false;
//			}
//		}
//		
//		return vacio;
	}
	
	public void addPila(String inStr) {
		if (estaLlenaPila()) {
			System.out.println("Mensaje de error");
		}else{
			this.buffer[longitudPila()] = inStr;
		}
	}
	
	public String sacarDeLaPila() {
		if (longitudPila()>0) {
			String out = this.buffer[longitudPila()-1];
			this.buffer[longitudPila()-1] = "*";
			return out;
		}else {
			System.out.println("ERROR: NO HAY NADA EN LA PILA - PILA VACIA");
			return "None";
		}

	}
	
	public void mostrarPila() {
		System.out.println(Arrays.toString(this.buffer));
	}
	
}
