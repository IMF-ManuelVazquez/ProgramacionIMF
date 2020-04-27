package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Multi_Camada;

public class Gato {
	
	private String nameGato;

	public Gato(String nombreGato) {
		this.nameGato = nombreGato;
	}

	public String getNombreGato() {
		return nameGato;
	}

	public void setNombreGato(String nombreGato) {
		this.nameGato = nombreGato;
	}

	@Override
	public String toString() {
		return "Gato [nombreGato=" + nameGato + "]";
	}
}
