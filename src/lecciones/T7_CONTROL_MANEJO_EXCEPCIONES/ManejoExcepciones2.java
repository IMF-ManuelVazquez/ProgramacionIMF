package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManejoExcepciones2 {
	static BufferedReader br;

	public static void main(String[] args) {

		try {
			Alumnos alumno = new Alumnos(AlumnosBrillantes.ANDREI, 6);
		} catch (AndreiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AsierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	public static void metodo1() throws IOException {
		metodo2();
	}

	public static void metodo2() throws IOException {
		metodo3();
	}

	public static void metodo3() throws IOException {
		metodo4();
	}

	public static void metodo4() throws IOException {
		
		br = new BufferedReader(new FileReader("pathname"));
		br.readLine();
		
	}

}
