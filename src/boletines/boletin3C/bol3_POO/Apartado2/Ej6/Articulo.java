package boletines.boletin3C.bol3_POO.Apartado2.Ej6;

public class Articulo {
	
	private String numPieza;
	private String descripcion;
	private int cantidad;
	private int precio;
	
	public Articulo(String numPieza, String descripcion, int cantidad, int precio) {
		super();
		this.numPieza = numPieza;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNumPieza() {
		return numPieza;
	}

	public void setNumPieza(String numPieza) {
		this.numPieza = numPieza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [numPieza=" + numPieza + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

}
