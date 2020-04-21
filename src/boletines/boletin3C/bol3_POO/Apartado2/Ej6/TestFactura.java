package boletines.boletin3C.bol3_POO.Apartado2.Ej6;

public class TestFactura {

	public static void main(String[] args) {
		
		Articulo articulo1 = new Articulo("ID001", "CocheDeChoque", 3, 30);
		Articulo articulo2 = new Articulo("ID002", "PowerRanger", 1, 100);
		Articulo articulo3 = new Articulo("ID003", "FifaPlay", 1, 50);

		Factura factura= new Factura();
		System.out.println(factura);
		
		factura.incluirArticulo(articulo1);
		System.out.println(factura);
		
		factura.incluirArticulo(articulo2);
		System.out.println(factura);
		
		factura.incluirArticulo(articulo3);
		System.out.println(factura);
		
//		for (int i = 0; i < 20; i++) {
//			factura.incluirArticulo(articulo3);
//			System.out.println(factura);
//		}
		
		System.out.println(factura.obtenerFactura());
		
	}

}
