package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseEnumSemaforo;

public class Semaforo {
//	public static final String COLOR_RED = "RED";
//	public static final String COLOR_YELLOW = "YELLOW";
//	public static final String COLOR_GREEN = "GREEN";
	
	public static void mostrarInformacionSegunColor(Colores color) {
		
		if (color.equals(Colores.RED)) {
			System.out.println("Cuidado no pase esta en rojo");
		}else if (color.equals(Colores.YELLOW)){
			System.out.println("Cuidado semaforo en ambar");
		}else if (color.equals(Colores.GREEN)){
			System.out.println("Pase semaforo en verde");
		}else if (color.equals(Colores.BLACK)) {
			System.out.println("color black");
		}
		
		
//		if (color.name().equals("RED")) {
//			System.out.println("Cuidado no pase esta en rojo");
//		}else if (color.name().equals("YELLOW")) {
//			System.out.println("Cuidado semaforo en ambar");
//		}else if (color.name().equals("GREEN")) {
//			System.out.println("Pase semaforo en verde");
//		}
		
		
//		if (color.toUpperCase().equals(COLOR_RED)) {
//			System.out.println("Cuidado no pase esta en rojo");
//		}else if (color.toUpperCase().equals(COLOR_YELLOW)) {
//			System.out.println("Cuidado semaforo en ambar");
//		}else if (color.toUpperCase().equals(COLOR_GREEN)) {
//			System.out.println("Pase semaforo en verde");
//		}else {
//			System.out.println("Color incorrecto");
//		}
	}
}
