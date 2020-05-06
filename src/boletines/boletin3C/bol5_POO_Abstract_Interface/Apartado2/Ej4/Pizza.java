package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej4;

public class Pizza implements Food{
	
	private Size size;
	private Type type;
	
	

	public Pizza(Size size, Type type) {
		super();
		this.size = size;
		this.type = type;
	}

	@Override
	public void setType(Type type) {
		this.type  = type;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public double calculatePrice() {
		
		if (this.size == Size.SMALL) {
			return 5;
		}else if (this.size == Size.MEDIUM) {
			return 7;
		}else if (this.size == Size.LARGE) {
			return 10;
		}else {
			return 0;
		}
	}

}
