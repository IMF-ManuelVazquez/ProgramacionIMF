package boletines.boletin3C.AgendaTelefono;

public class Contacto {
	
	private String nombre;
	private long telefono;
	
	public Contacto(String nombre, long telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	public boolean validarTelefono() {
		long num = 123456789;  // "123456789"
		// numero entre 100000000 y 999999999
		// disiion 100000000  (int) > 0
		// Opcion1
		//String strNum = String.valueOf(num);
		if (String.valueOf(num).length()==9) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
