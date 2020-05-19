package boletines.boletin6.Ej4;

import java.util.Scanner;

import boletines.boletin6.Ej4.excepciones.CampoVacio;
import boletines.boletin6.Ej4.excepciones.DetectadoMenorEdad;
import boletines.boletin6.Ej4.excepciones.FormatoDatoIncorrecto;

public class Cliente {
	
	private String nombre;
	private String email;
	private int edad;

	
	public Cliente(String nombre, String email, String edad) throws CampoVacio, FormatoDatoIncorrecto  {
		this.nombre = comprobarNombre(nombre);
		this.email = comprobarEmail(email);
		this.edad = comprobarEdad(edad);
	}
	
	public Cliente(String nombre, String email, int edad) throws CampoVacio, FormatoDatoIncorrecto {
		this.nombre = comprobarNombre(nombre);
		this.email = comprobarEmail(email);
		this.edad = comprobarEdad(edad);
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws CampoVacio, FormatoDatoIncorrecto  {
		this.nombre = comprobarNombre(nombre);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws CampoVacio, FormatoDatoIncorrecto {
		this.email = comprobarEmail(email);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(String edad) throws FormatoDatoIncorrecto, CampoVacio{
		this.edad = comprobarEdad(edad);
	}
	
	public void setEdad(int edad) throws FormatoDatoIncorrecto {
		this.edad = comprobarEdad(edad);
	}
	

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", email=" + email + ", edad=" + edad + "]";
	}
	
	
	// Solicitar datos del cliente [nombre, email, edad] vector de String de 3 posiciones.
	public static String[] solicitarDatos() {
		
		Scanner entrada = new Scanner(System.in);
		String[] datos = new String[3];
		
		System.out.println("********************************************");
		
		for (int i = 0; i < DatosSolicitados.values().length; i++) {
			System.out.print("Introduzca el siguiente dato, ");
			System.out.print(DatosSolicitados.values()[i]);
			System.out.print(" : ");
			datos[i] = entrada.nextLine();
		}
		
		return datos;
		
	}
	
	
	
	private String comprobarNombre(String nombre) throws CampoVacio, FormatoDatoIncorrecto {
		if (nombre.length()==0)  {
			throw new CampoVacio();
		}
		for (int i = 0; i < nombre.length(); i++) {	
			if (Character.isLetter(nombre.charAt(i)) == false) {
				throw new FormatoDatoIncorrecto();
			}
		}
		return nombre;
	}
	
	private String comprobarEmail(String email) throws CampoVacio, FormatoDatoIncorrecto {
		if (email.length()==0)  {
			throw new CampoVacio();
		}
		
		int detectado=0;
		for (int i = 0; i < email.length(); i++) {	
			if (email.charAt(i)=='@') {
				detectado++;
			}
		}
		if (detectado!=1) throw new FormatoDatoIncorrecto();
		
		return email;
	}
	
	private int comprobarEdad(int edad) throws FormatoDatoIncorrecto {
		if (edad < 0 || edad > 150) {
			throw new FormatoDatoIncorrecto();
		}
		if (edad<18) {
			throw new DetectadoMenorEdad();
		}
		return edad;
	}
	
	private int comprobarEdad(String edad) throws FormatoDatoIncorrecto, CampoVacio {
		if (edad.length()==0) {
			throw new CampoVacio();
		}
		int edadInt=0;
		try {
			edadInt = Integer.valueOf(edad);
		} catch (NumberFormatException e) {
			throw new FormatoDatoIncorrecto();
		}
		
		return comprobarEdad(edadInt);
	}
	
}
