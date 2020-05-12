package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado2.Ej2;

public class Cuadrado implements InterfazFigura {

	private int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (4*this.lado);
	}

}
