package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Peluqueria;

public enum Servicios {

	CORTE(5,1,2,"Que corte mas guapo"),
	LAVADO(2,3,4,"Te has queado limpio="),
	AFEITADO(1,5,6,"Estas hecho un pincel"),
	TINTE(3,6,7,"Me gusta el tinte");
	
	private double precio;
	private double precio1;
	private double precio2;
	private String descripcion;
	
	private Servicios(double precio, double precio1, double precio2, String descripcion) {
		this.precio = precio;
		this.precio1 = precio1;
		this.precio2 = precio2;
		this.descripcion = descripcion;
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
	public String getDescripcion() {
		return descripcion;
	}
	
}
