package lecciones.T5_INTRODUCCCION_PROGRAMACION_ORIENTADA_OBJETOS;

public class Persona {
	
	private String nombre;
	private int edad;
	private char sexo;
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	public void andar() {
		System.out.println(this.nombre+ " anda un poco");
	}
	
	public static void saludoGeneral() {
		System.out.println("Hola que ase?");
	}

}
