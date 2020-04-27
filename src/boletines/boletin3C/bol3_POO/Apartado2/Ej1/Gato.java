package boletines.boletin3C.bol3_POO.Apartado2.Ej1;

public class Gato {
	
	private String nombre;
	private String color;
	private String sexo;
	
	public Gato(String nombre, String color, String sexo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", sexo=" + sexo + "]";
	}
	
}
