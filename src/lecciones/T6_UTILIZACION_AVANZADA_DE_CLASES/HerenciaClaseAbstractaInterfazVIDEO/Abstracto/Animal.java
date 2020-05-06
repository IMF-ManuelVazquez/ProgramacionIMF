package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaClaseAbstractaInterfazVIDEO.Abstracto;

import java.util.ArrayList;

public abstract class Animal {
	
	private String especie;
	private String color;
	private String tipoAlimentacion;
	
	public abstract void comer();
	
	public void beber() {
		System.out.println("beber");
	}
	
	public void dormir() {
		System.out.println("dormir");
	}

}
