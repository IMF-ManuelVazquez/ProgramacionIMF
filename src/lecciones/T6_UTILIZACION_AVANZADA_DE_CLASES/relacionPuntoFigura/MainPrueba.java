package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionPuntoFigura;

public class MainPrueba {

	public static void main(String[] args) {
		
		Punto coor1 = new Punto(2,2);
		Punto coor2 = new Punto(5,5);
		
		Rectangulo rect = new Rectangulo();
		rect.setCoor1(coor1);
		rect.setCoor2(coor2);
		
		System.out.println(rect.getCoor1().getX());
		System.out.println(rect.getCoor1().getY());
		
		System.out.println(rect.getCoor1().toString());
		System.out.println(rect.getCoor2().toString());
		
		
		Rectangulo rect2 = new Rectangulo();
		rect2.setCoor1(coor1);
		rect2.setCoor2(coor2);
		
//		Triangulo tria = new Triangulo(coor1, coor2, new Punto(4, 4));
//		
//		
//		TrianguloEquilatero triaEq = new TrianguloEquilatero();
		
		// garbage collector >> recolector de basura >>> 

	}

}
