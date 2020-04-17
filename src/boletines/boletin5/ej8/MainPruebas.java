package boletines.boletin5.ej8;

import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		JuegoAdivinar juego = new JuegoAdivinar();
		//Ej8JuegoAdivinar juego2 = new Ej8JuegoAdivinar(60);
		
//		System.out.println(juego.nuevoIntento(50));
//		System.out.println(juego.nuevoIntento(70));
//		System.out.println(juego.nuevoIntento(60));
//		
//		System.out.println(juego);
//		
//		juego.nuevaPartida();
		
		// Una interfaz donde el usuario va metiendo numeros hasta que reciba el "ACERTASTES".
		Scanner entradaEscaner = new Scanner(System.in);
		String respuesta="";
		do {
			System.out.println("Usuario introduzca un numero");
			respuesta = juego.nuevoIntento(entradaEscaner.nextInt());
			System.out.println("resultado: "+respuesta);
		}while(respuesta!="ACERTASTES");

	}

}
