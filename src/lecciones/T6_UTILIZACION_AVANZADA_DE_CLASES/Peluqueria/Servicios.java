package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Peluqueria;

public enum Servicios {

	CORTE(5,1,2),
	LAVADO(2,3,4),
	AFEITADO(1,5,6),
	TINTE(3,6,7);
	
	private double precio;
	private double precio1;
	private double precio2;
	
	private Servicios(double precio, double precio1, double precio2) {
		this.precio = precio;
		this.precio1 = precio1;
		this.precio2 = precio2;
	}

	public double getPrecio() {
		return precio;
	}
	public double getPrecio1() {
		return precio1;
	}
	public double getPrecio2() {
		return precio2;
	}
	
}
