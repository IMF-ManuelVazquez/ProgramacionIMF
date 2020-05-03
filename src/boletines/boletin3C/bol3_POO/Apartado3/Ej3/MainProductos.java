package boletines.boletin3C.bol3_POO.Apartado3.Ej3;

public class MainProductos {

	public static void main(String[] args) {
		
		// polimorfismo : Pade hija-- Herencia &&  Interfaz 
		Producto producto = new Producto("fff", 5, 1.5);
		Producto perecedero = new Perecedero("leche", 12, 1, 1);
		Producto noPerecedero = new NoPerecedero("cacahuetes", 2, 3.2, "fruto seco");
		
		System.out.println(perecedero.calcular());
		System.out.println(noPerecedero.calcular());
		
		
//		Perecedero[] listaCompraPerecederos = new Perecedero[5];
//		listaCompraPerecederos[0] = perecedero;
//		listaCompraPerecederos[1] = perecedero;
//		listaCompraPerecederos[3] = noPerecedero;
//		
//		NoPerecedero[] listaCompraNoPerecederos = new NoPerecedero[5];
//		listaCompraNoPerecederos[0] = noPerecedero;
//		listaCompraNoPerecederos[1] = noPerecedero;
//		listaCompraNoPerecederos[3] = perecedero;
		
		
		Producto[] listaCompraProductos = new Producto[5];
		listaCompraProductos[0] = new Perecedero("carne", 4, 6.6, 2);
		listaCompraProductos[1] = new Perecedero("leche", 12, 1, 1);
		listaCompraProductos[2] = new Perecedero("carne2", 6, 2.2, 1);
		listaCompraProductos[3] = new Perecedero("carne3", 2, 7, 5);
		listaCompraProductos[4] = new NoPerecedero("cacahuetes", 2, 3.2, "fruto seco");
		
		for (int i = 0; i < listaCompraProductos.length; i++) {
			System.out.println("---------------");
			System.out.println("Producto nombre: "+ listaCompraProductos[i].getNombre());
			System.out.println("Producto nombre: "+ listaCompraProductos[i].calcular());
			System.out.println("---------------");
		}
		
		
		
		
		

	}

}
