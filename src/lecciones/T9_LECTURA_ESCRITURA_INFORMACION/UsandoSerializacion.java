package lecciones.T9_LECTURA_ESCRITURA_INFORMACION;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsandoSerializacion {
	
	private final static String HOME = System.getProperty("user.home");
	private static String pathname = HOME+"\\Desktop\\PROG_FICHEROS\\alumndfsdfo.dat";

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Manuel Vázquez", 22, "21312312z");
		System.out.println(alumno1);
		alumno1.setEdad(23);
		System.out.println(alumno1);
		
		writeObject(alumno1);
		
		//Alumno alumno = readObject();
		//System.out.println(alumno);
		
	}
	
	public static void writeObject(Alumno alumno) {
		try {
			ObjectOutputStream escribirObjetoAlumno = new ObjectOutputStream(new FileOutputStream(pathname));
			escribirObjetoAlumno.writeObject(alumno);
			escribirObjetoAlumno.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Alumno readObject() {
		Alumno alumnoLeido = null;
		try {
			
			ObjectInputStream lecturaObjetoAlumno = new ObjectInputStream(new FileInputStream(pathname));
			alumnoLeido = (Alumno) lecturaObjetoAlumno.readObject();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return alumnoLeido;
	
	}

}
