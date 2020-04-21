package boletines.boletin3C.bol3_POO.Apartado2.Ej6;

import java.util.Arrays;

public class Factura {

	private final int MAX_ARTICULOS = 10;
	private Articulo[] listadoArticulos = new Articulo[MAX_ARTICULOS];
	//private int numeroArticulosYaRegistrados = 0;
	
//	public void incluirArticulo(Articulo articulo) {
//		
//		if (numeroArticulosYaRegistrados<MAX_ARTICULOS) {
//			listadoArticulos[numeroArticulosYaRegistrados] = articulo;
//			numeroArticulosYaRegistrados++;
//		}else {
//			System.out.println("No se puede registrar");
//		}
//		
//	}
	
	private int posicionDisponible() {
		for (int i = 0; i < listadoArticulos.length; i++) {
			if (listadoArticulos[i]==null) {
				return i;
			}
		}
		return -1;
	}
	
	public void incluirArticulo(Articulo articulo) {
		if (posicionDisponible()>-1) {
			listadoArticulos[posicionDisponible()] = articulo;
		}else {
			System.out.println("No se puede registrar");
		}
	}
	
	public double obtenerFactura() { // obtenerImporte()
		double importeTotal = 0;
		for (int i = 0; i < listadoArticulos.length; i++) {
			if (listadoArticulos[i]!=null) {
				int cantidad = listadoArticulos[i].getCantidad();
				int precio = listadoArticulos[i].getPrecio();
				
				importeTotal = importeTotal + (cantidad*precio);
			}
		}
		return importeTotal;
	}

	@Override
	public String toString() {
		return "Factura [MAX_ARTICULOS=" + MAX_ARTICULOS + ", listadoArticulos=" + Arrays.toString(listadoArticulos)
				+ "]";
	}
	
}
