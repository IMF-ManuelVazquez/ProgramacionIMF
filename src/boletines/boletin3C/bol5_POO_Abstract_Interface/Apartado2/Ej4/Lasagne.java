package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej4;

public class Lasagne implements Food{

	private Type type;
	
	
	
	public Lasagne(Type type) {
		super();
		this.type = type;
	}

	@Override
	public void setType(Type type) {
		this.type  = type;
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 9;
	}

}
