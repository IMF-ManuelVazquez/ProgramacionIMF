package lecciones.T8_COLECCIONES_DE_DATOS.ArrayList;

import java.util.ArrayList;

public class Aula {
	
	ArrayList<Alumno> alumnado = new ArrayList<Alumno>();
	
	// Metodo añadir alumno.
	// Voy añadir un objeto alumno a mi ArrayList
	// PERO, solo si y solo sí el alumno no esta previamente registrado.
	// Un alumnos estan ya registrados/ reptidos si su dni se repite.
	
	public boolean annadirAlumno(Alumno alumno) {
		
		for (int i = 0; i < alumnado.size(); i++) {
			Alumno alumnoCogido = alumnado.get(i);
			if (alumnoCogido.getDni().equals(alumno.getDni())) {
				System.out.println("Contacto repetido");
				return false;
			}
		}
		
		for (Alumno alumnoCogido : alumnado) {
			if (alumnoCogido.getDni().equals(alumno.getDni())) {
				System.out.println("Contacto repetido");
				return false;
			}
		}
		
		alumnado.add(alumno);

		return true;
	}
	
	public void listar() {
		System.out.println(alumnado);
	}

}
