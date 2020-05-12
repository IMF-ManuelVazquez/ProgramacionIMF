package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej5;

public class Spider extends Animal{

	public Spider() {
		super(8);
	}
	
	@Override
	public void walk() {
		System.out.println("araña camina");
	}
	
	@Override
	public void eat() {
		System.out.println("araña come");
	}

}
