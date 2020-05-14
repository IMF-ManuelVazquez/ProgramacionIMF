package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

public class MainClases {

	public static void main(String[] args) {
		
		ClaseHija hija = new ClaseHija();
		try {
			hija.esperar(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try {
			hija.lanzarPropiaExcepcion();
		} catch (ExceptionPropia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
