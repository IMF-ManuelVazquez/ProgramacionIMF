package lecciones.T8_COLECCIONES_DE_DATOS.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MiprimerArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> agendaContactos = new ArrayList<String>(); // No necesitod ecirle el tama�o inicial!
		
		System.out.println(agendaContactos.size());
		
		agendaContactos.add("David");
		agendaContactos.add("Manuel");
		agendaContactos.add("Cesar");
		
		System.out.println(agendaContactos.size());

		String nombre = agendaContactos.get(1);
		System.out.println(nombre);
		
		//agendaContactos.set(1, "David");
		agendaContactos.add("David");
		System.out.println(agendaContactos.size());
		
		agendaContactos.set(3, "Enrique");
		
		agendaContactos.remove(2);
		System.out.println(agendaContactos.size());
		
		agendaContactos.remove(2);
		System.out.println(agendaContactos.size());
		
		//agendaContactos.remove(55);
		//System.out.println(agendaContactos.size());
		
		System.out.println(agendaContactos.contains("David"));
		System.out.println(agendaContactos.contains("Gonzalo"));
		
		System.out.println(agendaContactos.indexOf("Gonzalo"));
		System.out.println(agendaContactos.indexOf("Manuel"));
		
		// FOR CLASICO.
		for (int i = 0; i < agendaContactos.size(); i++) {   // 0   y 1
			String str = agendaContactos.get(i);
			System.out.println(str);
			//System.out.println(agendaContactos.get(i));
		}
		
		// FOREACH
		for (String str : agendaContactos) {
			System.out.println(str);
		}
		
	}

}
