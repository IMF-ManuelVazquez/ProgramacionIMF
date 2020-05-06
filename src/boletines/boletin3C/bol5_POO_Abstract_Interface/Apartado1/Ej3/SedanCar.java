package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado1.Ej3;

public class SedanCar extends Car{

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDescripcion() {
		System.out.println("Descripcion del sedan es un coche donde entra toda la familia");
	}

}
