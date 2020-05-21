package extra.mensajeEncriptado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsoEncriptador {
	private final static String HOME = System.getProperty("user.home");
	
	public static void main(String[] args) {
		
		String texto = "Mensaje para los alumnos de programacion, para ser un buen programador hay que practicar y experimentar mucho";
		
//		CifrarDescifrar cide = new CifrarDescifrar();
//		System.out.println(cide.cifrar(texto));
//		
//		String str = cide.cifrar(texto);
//		System.out.println(cide.descifrar(str));
//		
//		String pathname = HOME+"\\Desktop\\PROG_FICHEROS\\EncriptadorDesencriptador.dat";
//		try {
//			ObjectOutputStream escribiendoObj = new ObjectOutputStream(new FileOutputStream(pathname));
//			escribiendoObj.writeObject(cide);
//			escribiendoObj.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		String pathname = HOME+"\\Desktop\\PROG_FICHEROS\\EncriptadorDesencriptador.dat";
		try {
			ObjectInputStream readObj = new ObjectInputStream(new FileInputStream(pathname));
			InterfazCifrarDescifrar cide = (InterfazCifrarDescifrar) readObj.readObject();
			
			System.out.println(cide.cifrar(texto));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
