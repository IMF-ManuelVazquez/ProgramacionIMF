package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

public class Xiaomi extends Movil{

	

	@Override
	public void mensajeBienvenida() {
		System.out.println("Xiaomi te saluda");
		
	}
	
	public void informacionPrivadaAChina() {
		System.out.println("Van mis datos directamente a china a saber para qué");
	}

}
