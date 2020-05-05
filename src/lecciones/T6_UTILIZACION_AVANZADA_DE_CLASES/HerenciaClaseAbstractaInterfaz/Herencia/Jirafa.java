package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaClaseAbstractaInterfaz.Herencia;

public class Jirafa extends Animal{

	private int longitudCuello;
	private int longitudPatas;
	
	public Jirafa(String especie, String color, String tipoAlimentacion, int longitudCuello, int longitudPatas) {
		super(especie, color, tipoAlimentacion);
		this.longitudCuello = longitudCuello;
		this.longitudPatas = longitudPatas;
	}
	
	@Override
	public void dormir() {
		System.out.println("recoge el cuello como una persiana");
	}
	
	public void alcanzarCimaArbol() {
		System.out.println("La jirafa alcanza la cima");
	}

	
	
}
