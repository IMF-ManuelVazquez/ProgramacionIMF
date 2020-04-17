package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.plataformaAplicacion;

public class Vendedor {
	
	private int codVendedor;
	private String nombre;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(int codVendedor, String nombre) {
		this.codVendedor = codVendedor;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Vendedor [codVendedor=" + codVendedor + ", nombre=" + nombre + "]";
	}
}
