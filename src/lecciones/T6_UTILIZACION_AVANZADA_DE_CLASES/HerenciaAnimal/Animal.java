package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaAnimal;

public class Animal {
	
	private String especie;
	private String color;
	private String tipoAlimentacion;
	
//	public Animal() {
//		super();
//	}

	public Animal(String especie, String color, String tipoAlimentacion) {
		super();
		this.especie = especie;
		this.color = color;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	public void comer() {
		System.out.println("animal esta comiendo");
	}
	
	public void beber() {
		System.out.println("animal esta bebiendo");
	}
	
	public void dormir() {
		System.out.println("Animal esta durmiendo");
	}
	
	private void algoPrivado() {
		System.out.println("algo privado");
	}

}
