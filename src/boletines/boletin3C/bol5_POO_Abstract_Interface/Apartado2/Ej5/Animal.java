package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej5;

public abstract class Animal {
	
	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}

	public abstract void walk();
	
	public abstract void eat();

}
