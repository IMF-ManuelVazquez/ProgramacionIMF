package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseEnum;

import java.util.Arrays;

public class UsoEnum {
	
//	public static String COLOR_RED = "RED";
//	public static String COLOR_YELLOW = "YELLOW";
//	public static String COLOR_GREEN = "GREEN";
//	public static String COLOR_WHITE = "WHITE";
	
	public static void main(String[] args) {
		
//		String color = UsoEnum.COLOR_GREEN;
//		color = "hola";
//		mostrarInfoSemaforo (color);
		
		Colores colores = Colores.RED;
		probarMetodosEnum(colores);
		
	}
	
	public static void probarMetodosEnum(Colores colores) {
		System.out.println(colores.name());
		System.out.println(colores.ordinal());
		System.out.println(colores.toString());
		System.out.println(colores.equals(Colores.WHITE));
		System.out.println(colores.compareTo(Colores.GRAY));
		System.out.println(colores.compareTo(Colores.RED));
		System.out.println(colores.compareTo(Colores.YELLOW));
		System.out.println(Arrays.deepToString(colores.values()));
	}
	
	public static void mostrarInfoSemaforo(Colores color) {
		
		if (color.equals(Colores.RED)) {
			System.out.println("No pasar esta en rojo");
		}else if(color.equals(Colores.YELLOW)) {
			System.out.println("Cuidado al pasar esta en amarillo");
		}else if(color.equals(Colores.GREEN)) {
			System.out.println("Ok, pasa esta en verde");
		}else {
			System.out.println("color incorrecto");
		}
		
	}
	
//	public static void mostrarInfoSemaforo(String color) {
//		if (color.equals(COLOR_RED)) {
//			System.out.println("No pasar esta en rojo");
//		}else if(color.equals(COLOR_YELLOW)) {
//			System.out.println("Cuidado al pasar esta en amarillo");
//		}else if(color.equals(COLOR_GREEN)) {
//			System.out.println("Ok, pasa esta en verde");
//		}else {
//			System.out.println("color incorrecto");
//		}
//	}

}
