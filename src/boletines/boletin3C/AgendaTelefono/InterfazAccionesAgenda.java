package boletines.boletin3C.AgendaTelefono;

public interface InterfazAccionesAgenda {
	
	public boolean añadirContacto(Contacto c);
	public boolean existeContacto(Contacto c);
	public void listarContactos();
	public void buscaContacto(String nombre);
	public void eliminarContacto(Contacto c);
	public boolean agendaLlena();
	public int huecosLibres();
	
}
