package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

import java.util.ArrayList;

public class MiMovil {

	public static void main(String[] args) {
		
		
		Movil miMovil = new Samsung();
		System.out.println(miMovil);
		
		miMovil.cambiarEstadoMovil(EstadoMovil.APAGADO);
		
		System.out.println(miMovil);
		
		miMovil.cambiarEstadoMovil(EstadoMovil.ENCENDIDO);

		System.out.println(miMovil);
		
		miMovil.cambiarDisponibilidadMovil(DisponibilidadMovil.SIN_COBERTURA);
		System.out.println(miMovil);
		
		miMovil.cambiarDisponibilidadMovil(DisponibilidadMovil.OFF);
		System.out.println(miMovil);
		
		
		//////////////////////////////////////////////////
		
		// Vamos oa contincunion una tienda de moviles... y va miles de moviles de difernets marcas.

		// POLIMORFISMO: MISMA DEFINICION DIFERENTE FORMA.
		// Se puede definir usando la clase padre común o usando la interfaz común.
		Movil miXiomi = new Xiaomi();
		Movil miSamsung = new Samsung();
		Movil miIphone = new Iphone();
		
		miXiomi.mensajeBienvenida();
		miSamsung.mensajeBienvenida();
		miIphone.mensajeBienvenida();
		
		System.out.println("***********************");
		
		System.out.println(miXiomi);
		System.out.println(miSamsung);
		System.out.println(miIphone);
		
		miXiomi.cambiarEstadoMovil(EstadoMovil.ENCENDIDO);
		miSamsung.cambiarEstadoMovil(EstadoMovil.ENCENDIDO);
		miIphone.cambiarEstadoMovil(EstadoMovil.ENCENDIDO);
		
		miXiomi.cambiarDisponibilidadMovil(DisponibilidadMovil.SIN_COBERTURA);
		System.out.println(miXiomi);
		System.out.println(miSamsung);
		System.out.println(miIphone);
		
		System.out.println(miXiomi.llamar());
		System.out.println(miSamsung.llamar());
		
		/// crear tienda y meter moviles
		Tienda tienda = new Tienda("pepes", 100);
		tienda.annadirMovil(miXiomi);
		tienda.annadirMovil(miSamsung);
		tienda.annadirMovil(miIphone);
		
		System.out.println(tienda);
		
	}

}
