package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES.EjemploCrearExcepcion;

public class ExceptionNombre extends RuntimeException{

	public static final int ID_LONGITUD_MAX_ALCANZADA = 0 ;
	public static final int ID_LONGITUD_MIN_ALCANZADA = 1 ;
	private int id;

	public ExceptionNombre(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		if (this.id == ID_LONGITUD_MAX_ALCANZADA) {
			return "Problema al alcanzar longitud maxima";
		}else if (this.id == ID_LONGITUD_MIN_ALCANZADA) { 
			return "Problema no se ha alcanzado el tamaño minimo";
		}else {
			return "";
		}
		
	}
	
	
	
	
	
}
