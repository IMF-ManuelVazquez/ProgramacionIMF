package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Gato {
	
	private String nombreGato;

	public Gato(String nombreGato) {
		this.nombreGato = nombreGato;
	}

	public String getNombreGato() {
		return nombreGato;
	}

	public void setNombreGato(String nombreGato) {
		this.nombreGato = nombreGato;
	}

	@Override
	public String toString() {
		return "Gato [nombreGato=" + nombreGato + "]";
	}
}
