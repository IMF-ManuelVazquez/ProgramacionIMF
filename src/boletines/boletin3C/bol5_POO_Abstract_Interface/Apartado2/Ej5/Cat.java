package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej5;

public class Cat extends Animal implements InterfacePet{

	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}


	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Gato juega");
	}
	
	@Override
	public void walk() {
		System.out.println("Gato camina");
	}
	
	@Override
	public void eat() {
		System.out.println("Gato come");
	}

}
