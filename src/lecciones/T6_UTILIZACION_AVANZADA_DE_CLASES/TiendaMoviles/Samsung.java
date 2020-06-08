package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

public class Samsung extends Movil{

	@Override
	public void mensajeBienvenida() {
		System.out.println("Samsung te saluda");
		
	}

	public void informacionPrivadaAJapon() {
		System.out.println("Van mis datos directamente a Japon a saber para qué");
	}
}
