package lecciones.T5_INTRODUCCCION_PROGRAMACION_ORIENTADA_OBJETOS;


public class IntroPOO{
	// ATRIBUTOS
	private String nombre;

	// METODOS
	// CONSTRUCTOR
	public IntroPOO(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "IntroPOO [nombre=" + nombre + "]";
	}
	
	public static void hablar() {
		System.out.println("persona habla");
	}

}
