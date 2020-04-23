package boletines.boletin3C.bol3_POO.Apartado1.Ej2;

public class Factura {
	
	private String idPieza;
	private String descripcion;
	private int cantidad;
	private double precio;
	
	public Factura(String idPieza, String descripcion, int cantidad, double precio) {
		super();
		this.idPieza = idPieza;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public double obtenerFactura() {
		if (cantidad<=0 || precio<=0) {
			return 0;
		}else {
			return (this.precio*this.cantidad);
		}
	}

}
