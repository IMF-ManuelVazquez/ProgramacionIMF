package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaClaseAbstractaInterfaz.ClaseAbstracta;

public abstract class Animal {
	
	private String especie;
	private String color;
	private String tipoAlimentacion;
	

	public abstract void comer();  // El equivalente a una sentencia de una interfaz.
	
	public void beber() {
		System.out.println("beber");
	}
	
	public void dormir() {
		System.out.println("dormir");
	}

}
