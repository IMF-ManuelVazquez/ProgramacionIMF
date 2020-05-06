package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado1.Ej3;

public class SmallCar extends Car{

	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDescripcion() {
		
		System.out.println("Desrpcion del coche pequeño, Manu seguro qno entra en este coche");
		
	}

}
