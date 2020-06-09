package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

import java.util.ArrayList;

public class TiendaOrdenadores {
//	
//	public static int SOBREMESA = 0;
//	public static int PORTATIL = 1;
//	public static int SERVIDOR = 2;
//	
	final int NUMERO_MAXI = 10;
	private String nombre;
	private String direccion;
	private int capacidad;
	//private Ordenador[] conjuntoOrdenadores;  // [null,null,null,null,null,null,null,null] // MULTIPLICIDIDAD;  0...10
	private ArrayList<Ordenador> conjuntoOrdenadores = new ArrayList<Ordenador>();   // SIZE = 0 >>  CUAL EL TAMAÑO MAXIMO?? 
	
	
	public TiendaOrdenadores(String nombre, String direccion, int capacidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		//this.conjuntoOrdenadores = new Ordenador[capacidad]; // [null,null,null... null]  0 .. 1000
		this.conjuntoOrdenadores = new ArrayList<Ordenador>();   // SIZE = 0 >>  CUAL EL TAMAÑO MAXIMO?? 
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		// Reseteamos el catalogo de ordenadore y cambiamos el tamaño
		this.capacidad = capacidad;
		//this.conjuntoOrdenadores = new Ordenador[capacidad];
		// REseto el arraylist:
		this.conjuntoOrdenadores = new ArrayList<Ordenador>();
	}
	
	private int numeroHuecosDisponibles() {
//		int contador = 0;
//		for (int i = 0; i < this.conjuntoOrdenadores.length; i++) {
//			if (this.conjuntoOrdenadores[i]==null) {
//				contador++;
//			}
//		}
		// La capacidad de la tienda: capacidad
		// El tamaño de ordenador qeu tengo ahroa mismo: this.conjuntoOrdenadores.size()
		return (this.capacidad-this.conjuntoOrdenadores.size());
	}
	
	// [null,null,null,..... null] > veCTOR TIENE UN TAMAÑO FIJO Y CONSTANTE = ordenador.length = 50 posiciones.
	// [coche,coche,coche, null,null,nul....]]
	
	public void addOrdenador(Ordenador ordenador) {
		
		if (numeroHuecosDisponibles()>0) {
			
//			int posicion = 0;
//			while(this.conjuntoOrdenadores[posicion]!=null) {    // conjunto[3]!=null????
//				posicion++;
//			}
//			this.conjuntoOrdenadores[posicion] = ordenador;
			this.conjuntoOrdenadores.add(ordenador);
			
		}else {
			System.out.println("NO HUECOS DISPONIBLES");
		}
		
	}
	
	public void addOrdenador(TipoOrdenador tipoOrdenador, String cpu, int memoria, double precio){
		if (numeroHuecosDisponibles()>0) {
//			int posicion = 0;
//			while(this.conjuntoOrdenadores[posicion]!=null) {    // conjunto[3]!=null????
//				posicion++;
//			}
//			this.conjuntoOrdenadores[posicion] = new Ordenador(cpu, memoria, precio);
			
			if (tipoOrdenador.equals(TipoOrdenador.SOBREMESA)) {
				this.conjuntoOrdenadores.add(new OrdenadorSobremesa(cpu, memoria, precio));
			}else if (tipoOrdenador.equals(TipoOrdenador.PORTATIL)) {
				this.conjuntoOrdenadores.add(new Portatil(cpu, memoria, precio));
			}else if (tipoOrdenador.equals(TipoOrdenador.SERVIDOR)) {
				this.conjuntoOrdenadores.add(new Servidor(cpu, memoria, precio));
			}
			
		}else {
			System.out.println("NO HUECOS DISPONIBLES");
		}
		
	}

	// [ordenador1, ordenador3, orde4, orde4, orde4, orde5, orde6,null] 
	
//	private void sacarElemento(int posicion) {
//		for (int i = posicion; i < conjuntoOrdenadores.length-1; i++) {
//			this.conjuntoOrdenadores[i] = this.conjuntoOrdenadores[i+1];
//		}
//		this.conjuntoOrdenadores[this.conjuntoOrdenadores.length-1] = null;
//	}
	
	public void removeOrdenador(Ordenador ordenador) {
		
//		for (int i = 0; i < conjuntoOrdenadores.length; i++) {
//			if (this.conjuntoOrdenadores[i].equals(ordenador)) {
//				sacarElemento(i);
//			}
//		}
		this.conjuntoOrdenadores.remove(ordenador);
		
	}
	
	// [null,null,null,null]
	
	public void removeOrdenador(String cpu, int memoria, double precio) {
//		for (int i = 0; i < conjuntoOrdenadores.length; i++) {
//			if ( this.conjuntoOrdenadores[i].getCpu().equals(cpu) && this.conjuntoOrdenadores[i].getMemoria()==memoria && this.conjuntoOrdenadores[i].getPrecio()==precio ) {
//				sacarElemento(i);
//			}
//		}
		
//		for (int i = 0; i < conjuntoOrdenadores.length; i++) {
//			Ordenador ordenadorElemento = this.conjuntoOrdenadores[i];
//			if ( ordenadorElemento.getCpu().equals(cpu) && ordenadorElemento.getMemoria()==memoria && ordenadorElemento.getPrecio()==precio ) {
//				sacarElemento(i);
//			}
//		}
		for (int i = 0; i < conjuntoOrdenadores.size(); i++) {
			Ordenador ordenadorElemento = this.conjuntoOrdenadores.get(i);
			if ( ordenadorElemento.getCpu().equals(cpu) && ordenadorElemento.getMemoria()==memoria && ordenadorElemento.getPrecio()==precio ) {
				this.conjuntoOrdenadores.remove(i);
			}
		}
		
	}

}
