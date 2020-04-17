package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

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
