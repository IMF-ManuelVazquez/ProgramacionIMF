package boletines.boletin3C.bol3_POO.Apartado1.Ej3;

public class MainEmpleado {

	public static void main(String[] args) {


		Empleado empleado = new Empleado("Manuel", "Vazquez", 1000);
		
		Empleado empleado2 = new Empleado("Pepe", "Lopez", 2000);
		
		System.out.println(empleado);
		System.out.println(empleado2);
		
		empleado.incrementarSueldo(10);
		empleado2.incrementarSueldo(10);
		
		System.out.println(empleado);
		System.out.println(empleado2);
		
	}

}
