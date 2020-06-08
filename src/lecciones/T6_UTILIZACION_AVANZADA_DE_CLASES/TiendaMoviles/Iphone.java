package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

public class Iphone extends Movil{

	@Override
	public void mensajeBienvenida() {
		System.out.println("Iphone pasa de ti");
		
	}

	public void informacionPrivadaAChina() {
		System.out.println("Van mis datos directamente a Trump & Apple mejor no saber que hace con eso");
	}
}
