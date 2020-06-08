package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

import java.util.ArrayList;

public class Tienda {
	
	private String nombre;
	private int capacidadTienda;
	private ArrayList<Movil> catalogoMoviles = new ArrayList<Movil>();  // SIZE: 0  // MULTIPOICIDAD  0 .. capacidadTienda
	
	public Tienda(String nombre, int capacidadTienda) {
		super();
		this.nombre = nombre;
		this.capacidadTienda = capacidadTienda;
	}
	
	public boolean annadirMovil(Movil movil) {
		
		if (this.catalogoMoviles.size()<this.capacidadTienda) {
			catalogoMoviles.add(movil);
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "TiendaMoviles [nombre=" + nombre + ", capacidadTienda=" + capacidadTienda + ", catalogoMoviles="
				+ catalogoMoviles + "]";
	}
	
}
