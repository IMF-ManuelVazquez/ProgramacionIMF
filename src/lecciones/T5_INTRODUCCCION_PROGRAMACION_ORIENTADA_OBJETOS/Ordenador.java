package lecciones.T5_INTRODUCCCION_PROGRAMACION_ORIENTADA_OBJETOS;

public class Ordenador {
	
	private String procesador;
	private int memoria;
	private boolean estado;   // true: encendido & false: apagado
	
	public Ordenador(String procesador, int memoria) {
		super();
		this.procesador = procesador;
		this.memoria = memoria;
	}

	public Ordenador() {
		this.estado = false;
	}
	
	public void encender() {
		this.estado = true;
	}
	
	public void apagar() {
		this.estado = false;
	}
	
	public boolean saberEstado() {
		return estado;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	

}
