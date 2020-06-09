package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

public abstract class Ordenador {
	
	private String cpu;
	private int memoria;
	private double precio;
	
	public Ordenador(String cpu, int memoria, double precio) {
		super();
		this.cpu = cpu;
		this.memoria = memoria;
		this.precio = precio;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ordenador [cpu=" + cpu + ", memoria=" + memoria + ", precio=" + precio + "]";
	}
	
	public abstract double impuestoAñadidos();
	
}
