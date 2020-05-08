package boletines.boletin3C.AgendaTelefono;

public class MainAgenda {

	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto("manuel", 123456789);
		Contacto contacto2 = new Contacto("pepe", 123456783);
		Contacto contacto3 = new Contacto("luis", 123456785);
		
		Contacto contacto4 = new Contacto("pepe", 123123123);
		
		// Añadimos 3 contactos sin problema porque tienen nombre diferente, es lo único en lo que me fijo.
		Agenda agenda = new Agenda();
		agenda.añadirContacto(contacto1);
		agenda.añadirContacto(contacto2);
		agenda.añadirContacto(contacto3);
		
		// No puedo añadir contacto4 porque aunque el numero es distinto y es un objeto distinto, su nombre ya esta registrado.
		agenda.añadirContacto(contacto4);
		
		// Listo el estado actual de mi agenda separando cada contacto para mejorar su visualización.
		agenda.listarContactos();
		
		// Solicito un numero de Telefono de un contacto en la lista por su nombre.
		agenda.buscaContacto("manuel");
		
		// Solicito un numero de Telefono de un contacto que no está su nombre en la lista.
		agenda.buscaContacto("Arnold");
		
		// Eliminamos un contacto cuyo objeto esta igual en el listado, a través del propio objeto. Eliminar OK.
		agenda.eliminarContacto(contacto1);
		
		// Al trata de eliminar un objeto que no esta en el listado se genera un error.
		agenda.eliminarContacto(contacto4);
		
		// Preguntar si el listado esta lleno.
		System.out.println(agenda.agendaLlena());   // true esta lleno    false no esta lleno.
		
		// Preguntar por cuantos huecos libres queda en la colección dado que tenemos un número máximo como constante "NUM_MAX_CONTACTOS".
		System.out.println(agenda.huecosLibres());
		
		
		

	}

}
