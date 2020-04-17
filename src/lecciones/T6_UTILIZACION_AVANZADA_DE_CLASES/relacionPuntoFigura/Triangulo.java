package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionPuntoFigura;

public class Triangulo {

	private Punto coor1 = new Punto(6, 5);
	private Punto coor2 = new Punto(9, 3);
	private Punto coor3 = new Punto(9, 7);
	
	public Triangulo(Punto coor1, Punto coor2, Punto coor3) {
		super();
		this.coor1 = coor1;
		this.coor2 = coor2;
		this.coor3 = coor3;
	}
	
	public Punto getCoor1() {
		return coor1;
	}
	public void setCoor1(Punto coor1) {
		this.coor1 = coor1;
	}
	public Punto getCoor2() {
		return coor2;
	}
	public void setCoor2(Punto coor2) {
		this.coor2 = coor2;
	}
	public Punto getCoor3() {
		return coor3;
	}
	public void setCoor3(Punto coor3) {
		this.coor3 = coor3;
	}
	
	
	
	
}
