package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej2;

public class Triangulo implements InterfazFigura{

	private int base;
	private int altura;

	public Triangulo(int base, int altura) {
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
		return ((this.base*this.altura)/2);
	}

	@Override
	public double calcularPerimetro() {
		return (Math.sqrt(this.base*this.base)+(this.altura*this.altura));
	}
	
	

}
