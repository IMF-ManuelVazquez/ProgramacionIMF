package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.CardinalidadCamadaGatos;

import java.util.ArrayList;
import java.util.Arrays;

public class Camada {
	
	Gato[] camadaGatos = new Gato[4];
	
	public Camada() {
		camadaGatos[0]= new Gato("Garfield");
		camadaGatos[1]= new Gato("Miki");
		camadaGatos[2]= new Gato("Pipi");
		camadaGatos[3]= new Gato("Risi");
	}

//	public Camada(Gato gato1, Gato gato2, Gato gato3, Gato gato4) {
//		
//		camadaGatos[0]= new Gato("Garfield");
//		camadaGatos[1]= new Gato("Miki");
//		camadaGatos[2]= new Gato("Pipi");
//		camadaGatos[3]= new Gato("Risi");
//		
//	}
	
	public void dameInformacionDelGato(int pos) {
		//Gato gato = camadaGatos[pos];
		//System.out.println(gato.toString());
		
		System.out.println(camadaGatos[pos].toString());
	}

	@Override
	public String toString() {
		return "Camada [camadaGatos=" + Arrays.toString(camadaGatos) + "]";
	}
	
}
