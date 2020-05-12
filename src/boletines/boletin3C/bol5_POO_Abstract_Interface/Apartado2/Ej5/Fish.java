package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej5;

public class Fish extends Animal implements InterfacePet{

	private String name;
	
	protected Fish(String name) {
		super(0);
		this.name = name;
		// TODO Auto-generated constructor stub
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
		System.out.println("Pez juega");
	}

	@Override
	public void walk() {
		System.out.println("Pez camina??");
	}

	@Override
	public void eat() {
		System.out.println("Pez come");
	}

}
