package lecciones.T8_COLECCIONES_DE_DATOS.VideoLeccion;

import java.util.ArrayList;

public class AgendaMain {

	public static void main(String[] args) {
		
		ArrayList<Persona> agenda = new ArrayList<Persona>();
		
		System.out.println(agenda.size());
		Persona persona1 = new Persona("manuel", "vazquez");
		
		agenda.add(persona1);
		agenda.add(new Persona("pepe", "lpez"));
		agenda.add(new Persona("juan", "gutierrez"));
		
		System.out.println(agenda.size());
		
		// foreach
		for (Persona persona : agenda) {
			System.out.println(persona.getNombre());
		}
		
		// for clasico
		for (int i = 0; i < agenda.size(); i++) {
			//Persona persona = agenda.get(i);
			System.out.println(agenda.get(i).getNombre());
		}


//		agenda.remove(1);
//		System.out.println("size: "+agenda.size());
//
//		// for clasico
//		for (int i = 0; i < agenda.size(); i++) {
//			//Persona persona = agenda.get(i);
//			System.out.println(agenda.get(i).getNombre());
//		}
		
		
		
		System.out.println("ANTES");
		System.out.println("size: "+ agenda.size());
		for (Persona persona : agenda) {
			System.out.println(persona.getNombre());
		}
		
		// Algortimo que elimine en función del nombre
		String nombreEliminar = "mateo";
		
		for (int i = 0; i < agenda.size(); i++) {
			Persona persona = agenda.get(i);
			//System.out.println(persona.getNombre());
			if (persona.getNombre().equals(nombreEliminar)) {
				System.out.println("ELIMINADO");
				agenda.remove(i);
			}
		}
		
		System.out.println("Despues");
		System.out.println("size: "+ agenda.size());
		for (Persona persona : agenda) {
			System.out.println(persona);
		}

		
		System.out.println(agenda);
		
		

	}

}
