package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseAbstracta;

public class Tigre extends Animal{
	
	private int velocidad;

	public Tigre(String especie, String color, String tipoAlimentacion, int velocidad) {
		super(especie, color, tipoAlimentacion);
		this.velocidad = velocidad;
	}
	
	public void rugir() {
		System.out.println("El tigre ruge");
		super.dormir();
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Tigre come");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

}
