package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

public class ExceptionPropia extends Exception{

	private String texto;

	public ExceptionPropia(String texto) {
		super();
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "ExceptionNotas que es una excpecion Propia [texto=" + texto + "]";
	}
	
}
