package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Herencia2;

public class Tigre extends Animal{
	
	private int velocidad;
	
	
	public Tigre(String especie, String color, String tipoAlimentacion, int velocidad) {
		super(especie, color, tipoAlimentacion);
		this.velocidad = velocidad;
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		super.dormir();
		System.out.println("el tigre ronca mucho");
	}







	public void rugir() {
		
	}

}
