package boletines.boletin3C.bol3_POO.Apartado1.Ej3;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private double salario;
	
	public Empleado(String nombre, String apellido, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		if (this.salario<0) {
			this.salario = 0;
		}else {
			this.salario = salario;
		}
	}
	
	public void incrementarSueldo (int porcentajeIncremento) {
		
		this.salario=this.salario+this.salario*((double)porcentajeIncremento/100);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
	}

}
