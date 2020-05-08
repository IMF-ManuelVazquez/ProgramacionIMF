package boletines.boletin3C.AgendaTelefono;

import java.util.ArrayList;

public class Agenda implements InterfazAccionesAgenda{
	
	private final int NUM_MAX_CONTACTOS = 10;
	private ArrayList<Contacto> listado = new ArrayList<Contacto>();

	@Override
	public boolean añadirContacto(Contacto c) {
		
		if(listado.size()>=NUM_MAX_CONTACTOS) {
			System.out.println("Alcanzado numero max.");
			return false;
		}else {
			
			// Version old school
			for (int i = 0; i < listado.size(); i++) {
				Contacto contactoRecogido = listado.get(i);
				if (contactoRecogido.getNombre().equals(c.getNombre())) {
					System.out.println("Contacto duplicado");
					return false;
				}
			}
			
			listado.add(c);
			return true;
		}
	}

	@Override
	public boolean existeContacto(Contacto c) {
		// TODO Auto-generated method stub
		return listado.contains(c);
	}

	@Override
	public void listarContactos() {
		
		System.out.println("******************************");
		System.out.println("LISTADO CONTACTOS:");
		System.out.println("******************************");
		
		for (int i = 0; i < listado.size(); i++) {
			Contacto contactoRecogido = listado.get(i);
			System.out.println("Contacto: "+(i+1));
			System.out.println(contactoRecogido);
			System.out.println("----------");
		}
		
	}

	@Override
	public void buscaContacto(String nombre) {
		boolean detectado = false;
		for (Contacto contacto : listado) {
			if (contacto.getNombre().equals(nombre)) {
				System.out.println("Telefono solicitado: "+ contacto.getTelefono());
				detectado = true;
			}
		}
		
		if (detectado==false) {
			System.out.println("Contacto desconocido");
		}
	}

	@Override
	public void eliminarContacto(Contacto c) {
		
		int indiceContacto = listado.indexOf(c);
		if (indiceContacto>=0) {
			System.out.println("Detectado contacto en la posición: "+indiceContacto+". Procedemos a eliminarlo");
		}else{
			System.out.println("Contacto no detectado");
		}
		
	}

	@Override
	public boolean agendaLlena() {
		if (listado.size()==NUM_MAX_CONTACTOS) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int huecosLibres() {
		return NUM_MAX_CONTACTOS-listado.size();
	}

	
	
}
