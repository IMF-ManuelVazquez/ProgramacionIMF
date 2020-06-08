package lecciones.T5_INTRODUCCCION_PROGRAMACION_ORIENTADA_OBJETOS;

import java.util.ArrayList;

public class TiendaInformatica {
	
	private ArrayList<Ordenador> listadoOrdenadores;  // RELACIÓN TENGO AQUI!??? ENTRE TIENDAINFORMATICA VS ORDENADOR. RELACION DE ASOCIACION!!!!!!!
	private String nombre;
	private int capacidad;
	
	public TiendaInformatica(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	public boolean annadirOrdenador(String procesador, int memoria) {
		Ordenador newOrdenador = new Ordenador(procesador, memoria);
		if (this.listadoOrdenadores.size()<this.capacidad) {
			this.listadoOrdenadores.add(newOrdenador);
			return true;
		}
		return false;
		
	}
	
	public boolean annadirOrdenador(Ordenador ordenador) {
		if (this.listadoOrdenadores.size()<this.capacidad) {
			this.listadoOrdenadores.add(ordenador);
			return true;
		}
		return false;
	}
	
	public void apagarTodosLosOrdenadores() {
		
		for (int i = 0; i < listadoOrdenadores.size(); i++) {
			Ordenador ordenador = listadoOrdenadores.get(i);
			ordenador.apagar();
		}
		
		for (Ordenador ordenador : listadoOrdenadores) {
			if (ordenador.getProcesador().equals("Intel")){
					ordenador.apagar();
			}
		}
		
	}
	
	

}
