package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseAbstracta;

public class Jirafa extends Animal{

	private int longitudCuello;
	private int longitudPatas;
	
	public Jirafa(String especie, String color, String tipoAlimentacion, int longitudCuello, int longitudPatas) {
		super(especie, color, tipoAlimentacion);
		this.longitudCuello = longitudCuello;
		this.longitudPatas = longitudPatas;
	}
	

	public void alcanzarCimaArbol() {
		System.out.println("La jirafa alcanza la cima");
	}


	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Jirafa come");
		
	}


	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}


	
	
}
