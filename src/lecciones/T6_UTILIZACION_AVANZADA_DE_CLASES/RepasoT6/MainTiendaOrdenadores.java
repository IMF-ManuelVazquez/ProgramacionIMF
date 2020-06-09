package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

public class MainTiendaOrdenadores {

	public static void main(String[] args) {
		
		TiendaOrdenadores tienda;
		tienda = new TiendaOrdenadores("manolos", "micasa",50);   // 0 ..50
		TiendaOrdenadores tienda2 = new TiendaOrdenadores("pepes", "tucasa",1000);  // 0 ... 1000
		
		Ordenador orde = new Portatil("intel", 1000, 500);
		tienda.addOrdenador(orde);
		tienda2.addOrdenador(orde);
		
		Portatil porta = new Portatil("intel", 1000, 500);
		System.out.println(porta.impuestoAñadidos());
		
		OrdenadorSobremesa sobremesa = new OrdenadorSobremesa("intel", 1000, 500);
		System.out.println(sobremesa.impuestoAñadidos());
		
	}

}
