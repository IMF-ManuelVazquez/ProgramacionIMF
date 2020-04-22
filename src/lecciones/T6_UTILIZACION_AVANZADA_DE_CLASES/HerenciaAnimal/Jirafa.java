package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaAnimal;

import lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Herencia2.Animal;

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
	
	
}
