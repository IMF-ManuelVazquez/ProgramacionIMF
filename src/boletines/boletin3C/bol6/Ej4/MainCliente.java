package boletines.boletin3C.bol6.Ej4;

import java.util.Scanner;

import com.sun.security.ntlm.Client;

import boletines.boletin3C.bol6.Ej4.excepciones.CampoVacio;
import boletines.boletin3C.bol6.Ej4.excepciones.DetectadoMenorEdad;
import boletines.boletin3C.bol6.Ej4.excepciones.FormatoDatoIncorrecto;

public class MainCliente {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		Cliente cliente = null;
		do {
			String[] datos = Cliente.solicitarDatos();
			try {
				cliente = new Cliente(datos[DatosSolicitados.NOMBRE.ordinal()], datos[DatosSolicitados.EMAIL.ordinal()], datos[DatosSolicitados.EDAD.ordinal()]);
			} catch (CampoVacio e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Problema campo Vacio");
			} catch (FormatoDatoIncorrecto e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Problema dato formato incorrecto");
			} catch (DetectadoMenorEdad e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Detectado menor de edad");
			}
		}while (cliente==null);

		System.out.println(cliente);
	}

}
