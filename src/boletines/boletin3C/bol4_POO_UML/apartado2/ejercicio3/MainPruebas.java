package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio3;

public class MainPruebas {

	public static void main(String[] args) {
		
		ColeccionDeDiscos miColecciones = new ColeccionDeDiscos();
		miColecciones.annadirDisco();

		System.out.println(miColecciones);
	
		miColecciones.annadirDisco();

		System.out.println(miColecciones);
		
		miColecciones.eliminarDisco();
		
		System.out.println(miColecciones);
		
	}

}
