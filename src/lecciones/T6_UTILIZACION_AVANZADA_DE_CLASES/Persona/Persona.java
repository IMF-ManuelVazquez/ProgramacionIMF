package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Persona;

import java.util.Date;

public class Persona {
	private String name;
	private Date fecha;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Persona [name=" + name + ", fecha=" + fecha + "]";
	}
	
	public void andar() {
		System.out.println(this.name + "esta andando");
	}
}
