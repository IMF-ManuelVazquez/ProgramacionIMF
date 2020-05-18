package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES.EjemploCrearExcepcion;

public class NotasAlumnos {

	private String nombre;
	private String apellidos;
	private int nota;
	
	public NotasAlumnos(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = 0;
	}


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) throws ExceptionNombre{
		if (nombre.length()<1) {
			throw new ExceptionNombre(ExceptionNombre.ID_LONGITUD_MIN_ALCANZADA);
		}else if(nombre.length()>20) {
			throw new ExceptionNombre(ExceptionNombre.ID_LONGITUD_MAX_ALCANZADA);
		}
		
		this.nombre = nombre;
	}


	public int getNota() {
		return nota;
	}

	public void setNota(int nota) throws ExceptionNotas  {
		
		if (nota<0 || nota>10) {
			throw new ExceptionNotas();
		}else {
			this.nota = nota;
		}
		
	}

	@Override
	public String toString() {
		return "NotasAlumnos [nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + "]";
	}

}
