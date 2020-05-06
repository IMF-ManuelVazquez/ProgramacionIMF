package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado1.Ej3;

public abstract class Car {
	
	private CarType model;
	private Location location;
	
	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

	public abstract void mostrarDescripcion();
	
	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}

	
	
}
