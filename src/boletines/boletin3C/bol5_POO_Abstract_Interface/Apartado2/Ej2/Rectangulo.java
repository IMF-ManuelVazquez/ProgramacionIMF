package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej2;

public class Rectangulo implements InterfazFigura{

	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return ((this.base*2)+(this.altura*2));
	}

}
