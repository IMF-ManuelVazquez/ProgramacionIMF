package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseEnumSemaforo;

public class MainSemaforo {
	
	public static void main(String[] args) {
		
//		Semaforo.mostrarInformacionSegunColor(Colores.RED);
//		Semaforo.mostrarInformacionSegunColor(Colores.YELLOW);
//		Semaforo.mostrarInformacionSegunColor(Colores.GREEN);
//		Semaforo.mostrarInformacionSegunColor(Colores.BLACK);

		
//		String colorSemaforo = Semaforo.COLOR_RED;
//		colorSemaforo = Semaforo.COLOR_YELLOW;
//		colorSemaforo = "ggsdgfsge";
		
		Colores colorSemaforo;
		colorSemaforo = Colores.RED;
		
		System.out.println(colorSemaforo.name());
		System.out.println(colorSemaforo.ordinal());
		System.out.println(colorSemaforo.toString());
		System.out.println(colorSemaforo.equals(Colores.PINK));
		System.out.println(colorSemaforo.compareTo(Colores.RED));
		
		System.out.println(colorSemaforo.getDatoOut());
		System.out.println(colorSemaforo.getDatoOut2());
		
		
		TiposCliente tipo = TiposCliente.GOLD;
		tipo = TiposCliente.NORMAL;
		tipo = TiposCliente.PREMIUM;
		
	}

}
