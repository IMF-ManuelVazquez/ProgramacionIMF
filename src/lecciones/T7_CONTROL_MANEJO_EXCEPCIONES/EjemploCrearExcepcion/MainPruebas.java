package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES.EjemploCrearExcepcion;

public class MainPruebas {

	public static void main(String[] args) {
		
		NotasAlumnos alumno1 = new NotasAlumnos("Manuel", "vazquez");
		try {
			alumno1.setNota(9);
		} catch (ExceptionNotas e) {
			// TODO Auto-generated catch block
			System.out.println("Problema encontrado al poner la nota, la dejamos en 0 entonces");
			e.printStackTrace();
		}
		System.out.println(alumno1);
		
		//try {
			alumno1.setNombre("dawdawdawdawdawdawdawdawdawdawdawdawdawdawdawdawd");
		//}catch (ExceptionNombre e) {
		//	System.out.println("Capturo mi propia excepcion no era importante / obligatoria pero lo hago por algo");
		//}
		
		System.out.println(alumno1);

	}

}
